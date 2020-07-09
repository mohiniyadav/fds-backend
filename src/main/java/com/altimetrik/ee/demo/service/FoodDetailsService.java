package com.altimetrik.ee.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.FoodDetailsEntity;

@Service
public interface FoodDetailsService {
	public List<FoodDetailsEntity> getAllFoodItems();
	public String orderFood();
	public FoodDetailsEntity getByFoodItemName(String name);
}
