package com.example.lunch.controller;


import com.example.lunch.service.BaseService;


public abstract class AbstractController<S extends BaseService> {
    public final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
