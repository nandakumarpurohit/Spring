package com.demo.factory;

import com.demo.bean.EmployeeDTO;

public class EmployeeTypeWrapper {
	 
    private EmployeeDTO manager = null;
 
    private EmployeeDTO director = null;
 
    public EmployeeDTO getManager() {
        return manager;
    }
 
    public void setManager(EmployeeDTO manager) {
        this.manager = manager;
    }
 
    public EmployeeDTO getDirector() {
        return director;
    }
 
    public void setDirector(EmployeeDTO director) {
        this.director = director;
    }
}