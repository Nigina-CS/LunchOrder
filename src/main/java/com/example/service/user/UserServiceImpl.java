package com.example.service.user;

import com.example.configs.PasswordEncryption;
import com.example.dto.user.UserCreateDto;
import com.example.dto.user.UserDto;
import com.example.dto.user.UserUpdateDto;
import com.example.entity.user.AuthUser;
import com.example.mapper.UserMapper;
import com.example.repository.UserRepository;
import com.example.service.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<UserRepository, UserMapper> implements UserService {

    private final PasswordEncryption encryption;

    public UserServiceImpl(UserRepository repository, UserMapper mapper, PasswordEncryption encryption) {
        super(repository, mapper);
        this.encryption = encryption;
    }

    @Override
    public Long create(UserCreateDto createDto) {
        return null;
    }

    @Override
    public UserDto update(Long id, UserUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto get(Long id) {
        return null;
    }
}
