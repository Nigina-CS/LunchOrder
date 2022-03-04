package com.example.lunch.repository;

import com.example.lunch.entity.department.Department;
import com.example.lunch.repository.AbstractRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>, AbstractRepository {
}
