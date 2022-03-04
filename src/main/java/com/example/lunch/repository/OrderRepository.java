package com.example.lunch.repository;

import com.example.lunch.entity.meal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>, AbstractRepository {
}
