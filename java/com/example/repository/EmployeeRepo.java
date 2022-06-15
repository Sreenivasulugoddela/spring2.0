package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudDemo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{


    
}
