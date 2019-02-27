package com.wnn.springboot.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wnn.springboot.h2.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
