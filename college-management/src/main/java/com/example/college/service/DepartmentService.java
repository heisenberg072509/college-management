package com.example.college.service;

import com.example.college.entity.Department;
import com.example.college.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollege_Name(collegeName);
    }
}