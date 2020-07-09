package com.altimetrik.ee.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.altimetrik.ee.demo.entity.FoodDetailsEntity;
import com.altimetrik.ee.demo.repository.FoodDetailsRepository;
import com.altimetrik.ee.demo.service.FoodDetailsService;

@Service
public class FoodDetailsServiceImpl implements FoodDetailsService {
	
	@Autowired
	FoodDetailsRepository foodRepository;
	
	@Override
	public List<FoodDetailsEntity> getAllFoodItems() {
		return foodRepository.findAll();
	}

	@Override
	public String orderFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDetailsEntity getByFoodItemName(String name) {
		return foodRepository.getByName(name);
	}

}
