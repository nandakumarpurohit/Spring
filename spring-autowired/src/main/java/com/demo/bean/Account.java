package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {
	
	@Autowired(required=false)
	private Person person;
	
	private int id;
	private double balance;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [person=" + person + ", id=" + id + ", balance="
				+ balance + "]";
	}
	
}
