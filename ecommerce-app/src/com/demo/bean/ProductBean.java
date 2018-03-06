package com.demo.bean;

public class ProductBean {
	
	private String name;
	private int quantity;
	
	public ProductBean() {
		
	}
	
	public ProductBean(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void changeQuantity() {
		quantity += 25;
	}
	
	public String toString() {
		return "[" + name + "-->" + quantity + "]";
	}

}
