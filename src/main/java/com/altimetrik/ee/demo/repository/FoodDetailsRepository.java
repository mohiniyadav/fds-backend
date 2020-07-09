package com.altimetrik.ee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.ee.demo.entity.FoodDetailsEntity;

@Repository
public interface FoodDetailsRepository extends JpaRepository<FoodDetailsEntity, Long>{
	public FoodDetailsEntity getByName(String name);
}
