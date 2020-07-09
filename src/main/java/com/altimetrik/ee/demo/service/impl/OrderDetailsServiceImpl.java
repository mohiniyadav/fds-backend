package com.altimetrik.ee.demo.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.bean.OrderDetailsBean;
import com.altimetrik.ee.demo.entity.FoodDetailsEntity;
import com.altimetrik.ee.demo.entity.OrderDetailsEntity;
import com.altimetrik.ee.demo.repository.FoodDetailsRepository;
import com.altimetrik.ee.demo.repository.OrderDetailsRepository;
import com.altimetrik.ee.demo.service.FoodDetailsService;
import com.altimetrik.ee.demo.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	@Autowired
	OrderDetailsRepository orderRepository;
	
	@Autowired
	FoodDetailsService foodService;

	@Override
	public  Long orderFoodItems(OrderDetailsBean orders) {
		OrderDetailsEntity entity = new OrderDetailsEntity();
		BeanUtils.copyProperties(orders, entity);
		OrderDetailsEntity order;
		FoodDetailsEntity food = foodService.getByFoodItemName(orders.getItemName());
		if(food == null) {
			return null;
		}else {
		   long price = orders.getNumberOfDishes() * food.getPrice();
		   entity.setBill(price);
		   order = orderRepository.save(entity);
		}
		return order.getBill();
	}

}
