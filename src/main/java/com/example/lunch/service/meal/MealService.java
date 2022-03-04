package com.example.lunch.service.meal;

import com.example.lunch.entity.meal.Meal;
import com.example.lunch.dto.meal.MealCreateDto;
import com.example.lunch.dto.meal.MealDto;
import com.example.lunch.dto.meal.MealUpdateDto;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

public interface MealService extends GenericCrudService<
        Meal,
        MealDto,
        MealCreateDto,
        MealUpdateDto,
        Long>,
        BaseService {
}
