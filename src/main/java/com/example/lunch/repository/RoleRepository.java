package com.example.lunch.repository;

import com.example.lunch.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> ,AbstractRepository {

    Role findByCode(String roleCode);
}
