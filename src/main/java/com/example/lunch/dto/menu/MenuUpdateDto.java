package com.example.lunch.dto.menu;

import com.example.lunch.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuUpdateDto extends GenericDto {
    private LocalDate date = LocalDate.now();
    private Long mealId;
}
