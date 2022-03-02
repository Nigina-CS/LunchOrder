package com.example.mapper;

import com.example.dto.Dto;
import com.example.dto.GenericDto;
import com.example.entity.BaseEntity;

import java.util.List;



public interface BaseMapper<
        E extends BaseEntity,
        CD extends Dto,
        D extends GenericDto,
        UD extends GenericDto> extends Mapper {

    D toDto(E entity);

    List<D> toDto(List<E> entities);

    E fromCreateDto(CD createDto);

    E fromUpdateDto(UD updateDto);
}
