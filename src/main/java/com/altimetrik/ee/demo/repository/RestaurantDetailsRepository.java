package com.altimetrik.ee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.altimetrik.ee.demo.entity.RestaurantDetailsEntity;

@Repository
public interface RestaurantDetailsRepository extends JpaRepository<RestaurantDetailsEntity, Long>{
	public RestaurantDetailsEntity findByNameAndRating(String name, Integer rating);
}
