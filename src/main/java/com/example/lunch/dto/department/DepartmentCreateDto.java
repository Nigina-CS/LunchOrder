package com.example.lunch.dto.department;

import com.example.lunch.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class DepartmentCreateDto implements Dto {
    private String name;
    private String code;
    private Long chatId;
}
