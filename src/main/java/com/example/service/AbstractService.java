package com.example.service;

public abstract class AbstractService<R, M> implements BaseService {
    public final R repository;
    public final M mapper;

    public AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
