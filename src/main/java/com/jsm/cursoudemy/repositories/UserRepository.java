package com.jsm.cursoudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsm.cursoudemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
