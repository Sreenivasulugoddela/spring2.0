package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.crudDemo.entity.Employee;
import com.example.dao.EmployeeDao;
import com.example.repository.EmployeeRepo;

public abstract class EmployeeServiceImpl implements EmployeeService
{

	private EmployeeRepo employeerepo;
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo employeerepo)
	{
	   this.employeerepo=employeerepo;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
	
		return employeerepo.findAll();
	}

	@Override
	public Employee findById(int theId) {
		
		Optional<Employee> result=employeerepo.findById(theId);
		Employee theEmp=null;
		if(result.isPresent())
		{
			result.get();
		}
		return theEmp;
	}

	@Override
	public void save(Employee emp) 
	{
	 employeerepo.save(emp);	
	}

	@Override
	public void deleteById(int theid)
	{
	employeerepo.deleteById(theid);		
	}
       
}
