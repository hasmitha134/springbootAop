package com.example.spring_boot_Aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	 @Before("execution(* com.example.springbootaop.service.*.*(..))")
	    public void logBeforeMethod() {
	        System.out.println("A method in the service layer is about to be executed.");

}
}
