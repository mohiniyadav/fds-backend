package com.altimetrik.ee.demo.service;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.bean.RestaurantDetailsBean;

@Service
public interface RestaurantDetailsService {
	void getItemByNameAndPrice(String name, int rating);
	void addRestaurant(RestaurantDetailsBean restaurant);
}
