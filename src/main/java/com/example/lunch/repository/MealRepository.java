package com.example.lunch.repository;

import com.example.lunch.entity.meal.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long>,AbstractRepository{
}
