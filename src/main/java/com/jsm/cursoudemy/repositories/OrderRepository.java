package com.jsm.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsm.cursoudemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
