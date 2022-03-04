package com.example.lunch.mapper.meal;

import com.example.lunch.entity.meal.Order;
import com.example.lunch.dto.order.OrderCreateDto;
import com.example.lunch.dto.order.OrderDto;
import com.example.lunch.dto.order.OrderUpdateDto;
import com.example.lunch.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * shohista
 */
@Component
@Mapper(componentModel = "spring")
public interface OrderMapper  extends BaseMapper<
        Order,
        OrderDto,
        OrderCreateDto,
        OrderUpdateDto> {
    @Override
    default OrderDto toDto(Order order) {
        return null;
    }

    @Override
    default List<OrderDto> toDto(List<Order> e) {
        return null;
    }

    @Override
    default Order fromCreateDto(OrderCreateDto orderCreateDto) {
        return null;
    }

    @Override
    default Order fromUpdateDto(OrderUpdateDto d) {
        return null;
    }
}
