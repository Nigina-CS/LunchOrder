package com.example.lunch.service.user;

import com.example.lunch.dto.user.UserCreateDto;
import com.example.lunch.dto.user.UserDto;
import com.example.lunch.dto.user.UserUpdateDto;
import com.example.lunch.entity.user.AuthUser;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

public interface UserService extends GenericCrudService<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        Long >, BaseService {

}
