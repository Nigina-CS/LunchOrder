package com.example.lunch.dto.order;

import com.example.lunch.dto.GenericDto;

import java.time.LocalDate;

/**
 * shohista
 */
public class OrderDto extends GenericDto {
    private Long userId;
    private Long mealID;
    private LocalDate date;
    private boolean reasive;
}
