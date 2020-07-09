package com.altimetrik.ee.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.bean.RestaurantDetailsBean;
import com.altimetrik.ee.demo.entity.RestaurantDetailsEntity;
import com.altimetrik.ee.demo.repository.RestaurantDetailsRepository;
import com.altimetrik.ee.demo.service.RestaurantDetailsService;

@Service
public class RestaurantDetailsServiceImpl implements RestaurantDetailsService{
	
	@Autowired
	RestaurantDetailsRepository repository;
	
	@Override
	public void getItemByNameAndPrice(String name, int rating) {
		repository.findByNameAndRating(name, rating);
	}

	@Override
	public void addRestaurant(RestaurantDetailsBean restaurant) {
		RestaurantDetailsEntity entity =  new RestaurantDetailsEntity();
		BeanUtils.copyProperties(restaurant, entity);
		repository.save(entity);
	}

}
