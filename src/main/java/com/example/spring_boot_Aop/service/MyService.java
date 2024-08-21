package com.example.spring_boot_Aop.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public void performtask()
	{
		System.out.println("performing task in the service");
	}

}
