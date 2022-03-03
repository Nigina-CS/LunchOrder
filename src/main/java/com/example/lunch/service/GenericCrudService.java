package com.example.lunch.service;

import com.example.lunch.dto.Dto;
import com.example.lunch.dto.GenericDto;
import com.example.lunch.entity.BaseEntity;

import java.io.Serializable;


public interface GenericCrudService<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D,K> {

    K create(CD createDto);

    D update(K id, UD updateDto);

    Void delete(K id);
}
