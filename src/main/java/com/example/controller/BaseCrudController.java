package com.example.controller;

import com.example.dto.Dto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Bakhromjon Tue, 8:41 PM 3/1/2022
 */

public interface BaseCrudController<
        CD extends Dto,
        D extends AbstractDto,
        UD extends AbstractDto
        > extends BaseController {
    D create(@RequestBody CD createDto);

    Void delete(@PathVariable String id);

    D update(@PathVariable String id, @RequestBody UD updateDto);

    D get(@PathVariable String id);
}
