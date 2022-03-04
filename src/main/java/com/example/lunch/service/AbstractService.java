package com.example.lunch.service;

import com.example.lunch.mapper.Mapper;
import com.example.lunch.repository.AbstractRepository;

public abstract class AbstractService <R extends AbstractRepository,M extends Mapper> {
    protected final   R repository;
    protected final   M mapper;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
