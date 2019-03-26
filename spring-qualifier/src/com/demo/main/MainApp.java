package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.service.VehicleService;

public class MainApp {
	public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext();

	      // Scan beans
	      context.scan("com.demo.bean");
	      context.scan("com.demo.service");
	      context.refresh();

	      VehicleService vehicle = context.getBean(VehicleService.class);
	      vehicle.service();

	      context.close();
	   }
}
