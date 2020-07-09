package com.altimetrik.ee.demo.bean;

public class OrderDetailsBean {
	
	private String itemName;
	private int numberOfDishes;
	
	public OrderDetailsBean() {
		super();
	}
	
	public OrderDetailsBean(String itemName, int numberOfDishes) {
		super();
		this.itemName = itemName;
		this.numberOfDishes = numberOfDishes;
	}

	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public int getNumberOfDishes() {
		return numberOfDishes;
	}
	
	public void setNumberOfDishes(int numberOfDishes) {
		this.numberOfDishes = numberOfDishes;
	}
	
	@Override
	public String toString() {
		return "Item Name"+itemName+"@"+"Number Of Dishes Ordered"+numberOfDishes;
	}
}
