package com.jsm.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsm.cursoudemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
