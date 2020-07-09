package com.altimetrik.ee.demo.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.bean.OrderDetailsBean;
import com.altimetrik.ee.demo.bean.PairedComponentDetailsBean;
import com.altimetrik.ee.demo.bean.RestaurantDetailsBean;
import com.altimetrik.ee.demo.entity.FoodDetailsEntity;
import com.altimetrik.ee.demo.entity.OrderDetailsEntity;
import com.altimetrik.ee.demo.service.ComponentDetailsService;
import com.altimetrik.ee.demo.service.FoodDetailsService;
import com.altimetrik.ee.demo.service.OrderDetailsService;
import com.altimetrik.ee.demo.service.RestaurantDetailsService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ServiceController {

	protected static Logger logger = LoggerFactory.getLogger(ServiceController.class.getName());

	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	private ComponentDetailsService componentDetailsService;
	
	@Autowired
	private FoodDetailsService foodDetailsService;
	
	@Autowired
	private RestaurantDetailsService restaurantService;
	
	@Autowired
	private OrderDetailsService orderDetailService;

	@GetMapping(value = "/")
	@ApiOperation(value = "Get service name and identifier", notes = "Get service details and its corresponding values for all paired services", response = PairedComponentDetailsBean.class)
	public PairedComponentDetailsBean findAll() {
		return componentDetailsService.findAll(this.applicationName);
	}
	
	@GetMapping(value= "/getAllFoodItems")
	@ApiOperation(value = "Get service name and identifier", notes = "Get service details and its corresponding values for all paired services", response = FoodDetailsEntity.class)
	public List<FoodDetailsEntity> getAllFoodItem() {
		return foodDetailsService.getAllFoodItems();
	}
	
	@PostMapping(value= "/orderFood")
	@ApiOperation(value = "Get service name and identifier", notes = "Get service details and its corresponding values for all paired services", consumes = "application/json")
	public String orderFood(@RequestBody OrderDetailsBean orders) {
		Long order = orderDetailService.orderFoodItems(orders);
		return order == null ? "Food items not available right now...": orderDetailService.orderFoodItems(orders) + " rs/-";
	}

	@GetMapping(value = "/getRestaurant")
	@ApiOperation(value = "Get service name and identifier", notes = "Get service details and its corresponding values for all paired services", consumes = "application/json")
	public String getRestaurant(@RequestParam(value="name") String name, @RequestParam(value="rating") int rating) {
		restaurantService.getItemByNameAndPrice(name, rating);
		return applicationName;
	}
	
	@PostMapping(value = "/postRestaurantData")
	public void addRestaurants(@RequestBody RestaurantDetailsBean restaurant) {
		restaurantService.addRestaurant(restaurant);
	}
	
}
