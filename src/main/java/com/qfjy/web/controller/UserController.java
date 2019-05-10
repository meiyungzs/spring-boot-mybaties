package com.qfjy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfjy.bean.User;
import com.qfjy.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("all")			//user/all
	@ResponseBody
	public List<User> selectAll(){
		return userService.selectAll();
	}
	
}
