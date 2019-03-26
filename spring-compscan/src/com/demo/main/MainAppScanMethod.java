package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.service.EmployeeService;

public class MainAppScanMethod {
	public static void main(String[] args) {

	      AnnotationConfigApplicationContext context3 =
	            new AnnotationConfigApplicationContext();
	      
	      context3.scan("com.demo.service");
	      context3.scan("com.demo.dao");
	      context3.refresh();
	      
	      EmployeeService service3 = context3.getBean(EmployeeService.class);
	      service3.doSomething();
	      context3.close();
	   }
}
