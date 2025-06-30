package com.video3.saylon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.video3.saylon.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}

