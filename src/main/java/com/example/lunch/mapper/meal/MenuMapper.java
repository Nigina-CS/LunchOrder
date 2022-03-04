package com.example.lunch.mapper.meal;

import com.example.lunch.entity.meal.Menu;
import com.example.lunch.dto.menu.MenuCreateDto;
import com.example.lunch.dto.menu.MenuDto;
import com.example.lunch.dto.menu.MenuUpdateDto;
import com.example.lunch.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface MenuMapper  extends BaseMapper<
        Menu,
        MenuDto,
        MenuCreateDto,
        MenuUpdateDto> {
    @Override
    default MenuDto toDto(Menu menu) {
        return null;
    }

    @Override
    default List<MenuDto> toDto(List<Menu> e) {
        return null;
    }

    @Override
    default Menu fromCreateDto(MenuCreateDto menuCreateDto) {
        return null;
    }

    @Override
    default Menu fromUpdateDto(MenuUpdateDto d) {
        return null;
    }
}
