package com.example.lunch.dto.department;

import com.example.lunch.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class DepartmentDto extends GenericDto {
    private String name;
    private String code;
    private Long chatId;
}
