package com.altimetrik.ee.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "order_details")
public class OrderDetailsEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "numberOfDishes")
	private int numberOfDishes;
	
	@Column(name = "bill")
	private Long bill;

	public Long getBill() {
		return bill;
	}

	public void setBill(Long bill) {
		this.bill = bill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
	
}
