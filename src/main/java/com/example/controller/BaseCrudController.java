package com.example.controller;

import com.example.dto.Dto;
import com.example.dto.GenericDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BaseCrudController<
        CD extends Dto,
        D extends GenericDto,
        UD extends GenericDto
        > extends BaseController {
    D create(@RequestBody CD createDto);

    Void delete(@PathVariable String id);

    D update(@PathVariable String id, @RequestBody UD updateDto);

    D get(@PathVariable String id);
}
