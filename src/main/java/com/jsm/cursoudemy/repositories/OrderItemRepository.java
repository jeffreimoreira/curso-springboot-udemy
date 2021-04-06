package com.jsm.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsm.cursoudemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
