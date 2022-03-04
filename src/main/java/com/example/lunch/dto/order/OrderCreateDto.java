package com.example.lunch.dto.order;

import com.example.lunch.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * shohista
 */
@Getter
@Setter
@AllArgsConstructor
public class OrderCreateDto implements Dto {
    private Long userId;
    private Long mealID;
    private LocalDate date;
    private boolean recieve;
}
