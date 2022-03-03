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
public class UserCreateDto implements Dto {
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String role;
    private String language;
    private String chatId;
    private Long departmentId;

}
