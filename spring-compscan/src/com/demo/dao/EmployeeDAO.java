package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

   public void doSomething() {
      System.out.println("Inside EmployeeDao's doSomething() method.");
   }
}