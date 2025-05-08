package com.cash.up.cash_up_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cash.up.cash_up_api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    Optional<User> findByEmail(String username);
}
