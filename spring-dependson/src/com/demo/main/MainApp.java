package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.BeanOne;
import com.demo.config.AppConfig;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      BeanOne bean=context.getBean(BeanOne.class);
      bean.doSomthing();
      context.close();
   }
}