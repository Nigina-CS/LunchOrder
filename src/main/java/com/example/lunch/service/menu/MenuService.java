package com.example.lunch.service.menu;

import com.example.lunch.entity.meal.Menu;
import com.example.lunch.dto.menu.MenuCreateDto;
import com.example.lunch.dto.menu.MenuDto;
import com.example.lunch.dto.menu.MenuUpdateDto;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

/**
 * shohista
 */
public interface MenuService extends GenericCrudService<
        Menu,
        MenuDto,
        MenuCreateDto,
        MenuUpdateDto,
        Long>,
        BaseService{
}
