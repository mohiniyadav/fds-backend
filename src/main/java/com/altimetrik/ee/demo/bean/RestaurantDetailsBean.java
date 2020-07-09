package com.altimetrik.ee.demo.bean;

public class RestaurantDetailsBean {
	
	private String name;
	private int rating;
	private int foodItem;
	private int price;
	
	public RestaurantDetailsBean() {
		super();
	}

	public RestaurantDetailsBean(String name, int rating, int foodItem, int price) {
		super();
		this.name = name;
		this.rating = rating;
		this.foodItem = foodItem;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(int foodItem) {
		this.foodItem = foodItem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "RestaurantDetailsBean [name=" + name + ", rating=" + rating + ", foodItem=" + foodItem + ", price="
				+ price + "]";
	}
	
}
