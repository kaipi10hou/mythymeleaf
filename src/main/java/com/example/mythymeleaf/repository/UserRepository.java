package com.example.mythymeleaf.repository;

import com.example.mythymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
