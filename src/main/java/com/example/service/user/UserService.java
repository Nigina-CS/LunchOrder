package com.example.service.user;

import com.example.dto.user.UserCreateDto;
import com.example.dto.user.UserDto;
import com.example.dto.user.UserUpdateDto;
import com.example.entity.user.AuthUser;
import com.example.service.BaseService;
import com.example.service.GenericCrudService;

public interface UserService extends GenericCrudService<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        Long >, BaseService {

}
