package com.example.lunch.service;

import com.example.lunch.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService<
        D extends GenericDto,
        K extends Serializable> {

    List<D> getAll();

    D get (K id);
    default void activate(K id){};

    default void block (K id){};

    default void unblock(K id) {};

}
