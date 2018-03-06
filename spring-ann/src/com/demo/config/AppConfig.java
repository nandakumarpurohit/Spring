package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.HelloWorld;


@Configuration
public class AppConfig {
	@Bean(name="myBean")
	public HelloWorld getHelloWorld(){
		return new HelloWorld();
	}
}