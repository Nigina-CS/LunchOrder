package com.example.lunch.mapper;

import com.example.lunch.dto.user.UserCreateDto;
import com.example.lunch.dto.user.UserDto;
import com.example.lunch.dto.user.UserUpdateDto;
import com.example.lunch.entity.user.AuthUser;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;



@Component
@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto > {
}
