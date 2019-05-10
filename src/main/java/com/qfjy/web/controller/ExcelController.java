package com.qfjy.web.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import cn.afterturn.easypoi.handler.inter.IExcelDataHandler;
import cn.afterturn.easypoi.util.PoiPublicUtil;

import com.qfjy.bean.User;
import com.qfjy.service.UserService;
import com.qfjy.utiles.ExcelUtiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Excel")
public class ExcelController {

	@Autowired
	private UserService userService;

	@GetMapping("/export")    // Excel/export
	public void export(HttpServletResponse response) {
		System.out.println(1);
//        模拟从数据库获取需要导出的数据
		List<User> personList = userService.selectAll();
//         导出操作
		ExcelUtiles.exportExcel(personList, "测试名", "什么名字", User.class, "测试.xls", response);
	}

	@PostMapping("/importExcel2") // Excel/importExcel2
	public void importExcel2(@RequestParam("file") MultipartFile file) {
		ImportParams importParams = new ImportParams();
		// 数据处理
		importParams.setHeadRows(1);
		importParams.setTitleRows(1);
		// 需要验证
		importParams.setNeedVerfiy(true);
		try {
			ExcelImportResult<User> result = ExcelImportUtil.importExcelMore(file.getInputStream(), User.class,
					importParams);
			List<User> successList = result.getList();
			for (User user : successList) {
				int num = userService.insertSelective(user);
				System.out.println(user);
			}
		} catch (IOException e) {
		} catch (Exception e) {
		}
	}

}
