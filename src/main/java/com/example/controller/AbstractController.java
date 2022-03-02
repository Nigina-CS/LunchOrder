package com.example.controller;


import com.example.service.BaseService;

/**
 * @author Bakhromjon Tue, 8:53 PM 3/1/2022
 */
public abstract class AbstractController<S extends BaseService> implements BaseController {
    public final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
