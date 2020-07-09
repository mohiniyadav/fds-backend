package com.altimetrik.ee.demo.bean;

public class FoodDetailsBean {
	
	private String name;
	private String price;
	
	public FoodDetailsBean() {
		super();
	}

	public FoodDetailsBean(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "food item"+name+"@"+"food item price"+price;
	}

}
