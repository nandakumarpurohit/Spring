package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.EmployeeService;

public class MainApp {
   public static void main(String[] args) {

      @SuppressWarnings("resource")
      ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
      EmployeeService service1 = context1.getBean(EmployeeService.class);
      service1.doSomething();

   }
}