package com.example.service;

import com.example.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService<
        D extends GenericDto,
        K extends Serializable> {

    List<D> getAll();

    D get (K id);

}
