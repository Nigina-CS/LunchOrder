package com.example.lunch.service.order;

import com.example.lunch.entity.meal.Order;
import com.example.lunch.dto.order.OrderCreateDto;
import com.example.lunch.dto.order.OrderDto;
import com.example.lunch.dto.order.OrderUpdateDto;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

public interface OrderService extends GenericCrudService<
        Order,
        OrderDto,
        OrderCreateDto,
        OrderUpdateDto,
        Long>,
        BaseService {
}
