package com.restapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable> {

}
