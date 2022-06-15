package com.example.dao;

import java.util.List;

import com.example.crudDemo.entity.Employee;


public interface EmployeeDao 
{
    public List<Employee> findAll();

	public Employee findById(int theId);
	
	public void save(Employee empId);
	
	public void deleteById(int theId);
    
}
