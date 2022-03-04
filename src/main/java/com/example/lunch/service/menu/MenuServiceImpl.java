package com.example.lunch.service.menu;

import com.example.lunch.dto.menu.MenuCreateDto;
import com.example.lunch.dto.menu.MenuDto;
import com.example.lunch.dto.menu.MenuUpdateDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * shohista
 */
@Service("menuService")
@Slf4j
@RequiredArgsConstructor
@Transactional
public class MenuServiceImpl implements MenuService{
    @Override
    public Long create(MenuCreateDto createDto) {
        return null;
    }

    @Override
    public MenuDto update(Long id, MenuUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<MenuDto> getAll() {
        return null;
    }

    @Override
    public MenuDto get(Long id) {
        return null;
    }
}
