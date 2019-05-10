package com.qfjy.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {


    /**
     * 进入主页面
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
