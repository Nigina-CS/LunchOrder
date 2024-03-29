package com.example.lunch.dto.complain;

import com.example.lunch.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ComplainDto extends GenericDto {
    private String text;
    private Long userId;
}
