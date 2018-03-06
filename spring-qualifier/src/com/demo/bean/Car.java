package com.demo.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {

   @Override
   public void start() {
      System.out.println("Car started");
   }

   @Override
   public void stop() {
      System.out.println("Car stopped");
   }

}
