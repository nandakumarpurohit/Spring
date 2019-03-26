package com.demo.bean;

public class EmployeeDTO
{
    public static final EmployeeDTO MANAGER = new EmployeeDTO("manager");
 
    public static final EmployeeDTO DIRECTOR = new EmployeeDTO("director");
 
    private Integer id;
    private String firstName;
    private String lastName;
    private String designation;
 
    public EmployeeDTO(String designation)
    {
        this.id = -1;
        this.firstName = "dummy";
        this.lastName = "dummy";
        this.designation = designation;
    }
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", type=" + designation + "]";
    }
}