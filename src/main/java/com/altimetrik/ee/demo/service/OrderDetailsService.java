package com.altimetrik.ee.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.bean.OrderDetailsBean;
import com.altimetrik.ee.demo.entity.FoodDetailsEntity;
import com.altimetrik.ee.demo.entity.OrderDetailsEntity;

@Service
public interface OrderDetailsService {

	Long orderFoodItems(OrderDetailsBean orders);

}
