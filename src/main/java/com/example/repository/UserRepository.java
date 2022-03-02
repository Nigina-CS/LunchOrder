package com.example.repository;

import com.example.entity.user.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AuthUser,Long> {
}
