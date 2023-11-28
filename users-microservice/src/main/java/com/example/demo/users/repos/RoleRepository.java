package com.example.demo.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.users.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
   Role findByRole(String role);
}