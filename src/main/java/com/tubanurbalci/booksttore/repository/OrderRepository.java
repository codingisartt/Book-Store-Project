package com.tubanurbalci.booksttore.repository;

import com.tubanurbalci.booksttore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
