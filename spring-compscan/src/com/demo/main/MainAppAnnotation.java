package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.EmployeeService;

public class MainAppAnnotation {
	public static void main(String[] args) {

	      @SuppressWarnings("resource")
	      ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
	      EmployeeService service2 = context2.getBean(EmployeeService.class);
	      service2.doSomething();
	   }
}
