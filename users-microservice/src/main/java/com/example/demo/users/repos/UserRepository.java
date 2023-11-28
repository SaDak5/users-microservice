package com.example.demo.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.users.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}