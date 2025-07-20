package com.example.controle_financas.repository;

import com.example.controle_financas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
