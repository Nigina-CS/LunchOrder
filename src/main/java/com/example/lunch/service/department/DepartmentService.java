package com.example.lunch.service.department;

import com.example.lunch.entity.department.Department;
import com.example.lunch.dto.department.DepartmentCreateDto;
import com.example.lunch.dto.department.DepartmentDto;
import com.example.lunch.dto.department.DepartmentUpdateDto;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

public interface DepartmentService extends GenericCrudService<
        Department,
        DepartmentDto,
        DepartmentCreateDto,
        DepartmentUpdateDto,
        Long>,
        BaseService {
}
