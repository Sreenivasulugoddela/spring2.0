package com.example.RestController;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudDemo.entity.Employee;
import com.example.dao.EmployeeDao;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class Controller
{
    
	private EmployeeService employeeService;
	@Autowired
	public Controller(EmployeeService employeeService)
	{
		employeeService=employeeService;
	}
	 
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
    @GetMapping("/employees/{employeeID}") 	
    public Employee getEmployee(@PathVariable int  theId)
    {
    	Employee emp=employeeService.findById(theId);
    	if(emp==null)
    	{
    		throw new RuntimeException("not Found");
    	}
    	return emp;
    }
     @PostMapping("/employees")
     public Employee addEmployee(@RequestBody Employee employee)
     {
    	employee.setEmpId(0);
    	employeeService.save(employee);
    	
    	return employee;
     }
     @PutMapping("/employees")
     public Employee updateAnEmployee(@RequestBody Employee emp)
     {
    	employeeService.save(emp);
    	return emp;
     }
     @DeleteMapping("/employees/{employeeId}")     
     public String deleteByiD(@PathVariable int theId)
     {
    	 Employee emp=employeeService.findById(theId);
    	 if(emp==null)
    	 {
    		 throw new RuntimeException("not found");
    	 }
    	 employeeService.deleteById(theId);
    	 return "delete id is"+theId;
     }





}
















