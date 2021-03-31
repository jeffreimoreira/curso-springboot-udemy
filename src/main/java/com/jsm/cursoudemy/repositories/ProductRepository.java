package com.jsm.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsm.cursoudemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
