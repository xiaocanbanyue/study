package com.mdjin.springBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdjin.springBootDemo.common.annotation.PersonalLog;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	@PersonalLog
	public String home() {
        return "Hello World!";
    }
	
}