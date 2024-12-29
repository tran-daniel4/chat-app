package com.example.chat_app.repository;

import com.example.chat_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUser(String username);
}
