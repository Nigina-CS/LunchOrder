package com.example.lunch.mapper.meal;

import com.example.lunch.entity.meal.Meal;
import com.example.lunch.dto.meal.MealCreateDto;
import com.example.lunch.dto.meal.MealDto;
import com.example.lunch.dto.meal.MealUpdateDto;
import com.example.lunch.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface MealMapper  extends BaseMapper<
        Meal,
        MealDto,
        MealCreateDto,
        MealUpdateDto> {

    @Override
    default MealDto toDto(Meal meal) {
        return null;
    }

    @Override
    default List<MealDto> toDto(List<Meal> e) {
        return null;
    }

    @Override
    default Meal fromCreateDto(MealCreateDto mealCreateDto) {
        return null;
    }

    @Override
    default Meal fromUpdateDto(MealUpdateDto d) {
        return null;
    }
}
