package com.example.controller;


import com.example.service.BaseService;


public abstract class AbstractController<S extends BaseService> implements BaseController {
    public final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
