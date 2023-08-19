package com.smart.backend.smart.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.backend.smart.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
