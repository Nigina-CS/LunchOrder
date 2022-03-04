package com.example.lunch.dto.user;

import com.example.lunch.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto implements Dto {
    private String username;
    private String password;
}
