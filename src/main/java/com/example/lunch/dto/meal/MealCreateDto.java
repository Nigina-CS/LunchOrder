package com.example.lunch.dto.meal;

import com.example.lunch.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MealCreateDto implements Dto {
    private String name;
    private String image;
    private String type;
}
