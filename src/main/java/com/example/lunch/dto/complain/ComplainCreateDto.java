package com.example.lunch.dto.complain;

import com.example.lunch.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ComplainCreateDto implements Dto {
    private String text;
    private Long userId;
}
