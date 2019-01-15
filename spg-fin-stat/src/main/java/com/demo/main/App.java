package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.factory.EmployeeTypeWrapper;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		EmployeeTypeWrapper employeeTypeWrapper = (EmployeeTypeWrapper) context.getBean("employeeTypeWrapper");
		 
		System.out.println(employeeTypeWrapper.getManager());
		System.out.println(employeeTypeWrapper.getDirector());
	}

}
