package com.example.spring_boot_Aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_Aop.service.MyService;
@RestController

public class MyController {
	
	@Autowired
	
	private MyService myservice;
	
	@GetMapping("/task")
	 public String executeTask() {
	        myservice.performtask();
	        return "Task Executed";
	    }

}
