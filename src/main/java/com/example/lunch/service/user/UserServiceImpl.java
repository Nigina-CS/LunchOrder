package com.example.lunch.service.user;

import com.example.lunch.configs.encryption.PasswordEncryption;
import com.example.lunch.dto.user.UserCreateDto;
import com.example.lunch.dto.user.UserDto;
import com.example.lunch.dto.user.UserUpdateDto;
import com.example.lunch.entity.user.AuthUser;
import com.example.lunch.mapper.UserMapper;
import com.example.lunch.repository.UserRepository;
import com.example.lunch.service.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl extends AbstractService<UserRepository, UserMapper> implements UserService {

    private final PasswordEncryption encryption;

    public UserServiceImpl(UserRepository repository, UserMapper mapper, PasswordEncryption encryption) {
        super(repository, mapper);
        this.encryption = encryption;
    }

    @Override
    public Long create(UserCreateDto createDto) {
        AuthUser user = mapper.fromCreateDto(createDto);
        repository.save(user);
        return user.getId();
    }

    @Override
    public UserDto update(Long id,UserUpdateDto updateDto) {
        AuthUser user = mapper.fromUpdateDto(updateDto);
        repository.save(user);
        return mapper.toDto(user);
    }

    @Override
    public Void delete(Long id) {
        repository.delete(id);
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        List<AuthUser> users = repository.findAll();
        return mapper.toDto(users);
    }

    @Override
    public UserDto get(Long id) {
        Optional<AuthUser> user = repository.findById(id);
        return mapper.toDto(user.get());
    }

    @Override
    public void activate (Long id) {
        repository.activate(id);
    }

    @Override
    public void block (Long id) {
        repository.block(id);
    }

    @Override
    public void unblock (Long id) {
        repository.unblock(id);
    }
}
