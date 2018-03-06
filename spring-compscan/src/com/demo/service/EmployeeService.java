package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;

@Service
public class EmployeeService {

   @Autowired
   private EmployeeDAO employeeDAO;
   
   public void doSomething(){
      System.out.println("Inside EmployeeService's doSomething() method.");
      employeeDAO.doSomething();
   }
}
