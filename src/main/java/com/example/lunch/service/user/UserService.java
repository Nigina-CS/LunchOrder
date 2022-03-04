package com.example.lunch.service.user;

import com.example.lunch.dto.user.UserCreateDto;
import com.example.lunch.dto.user.UserDto;
import com.example.lunch.dto.user.UserUpdateDto;
import com.example.lunch.entity.user.AuthUser;
import com.example.lunch.entity.user.Role;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface UserService extends GenericCrudService<
        AuthUser,
        UserDto,
        UserCreateDto,
        UserUpdateDto,
        Long >, BaseService , UserDetailsService {
    Role saveRole(Role role);

    void attachRoleToUser(String username, String roleCode);

    UserDto getUserByUsername(String username);

    void getRefreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
