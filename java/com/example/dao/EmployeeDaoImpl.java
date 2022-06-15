package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.crudDemo.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
   
	private EntityManager entityManager;
	@Autowired
	public EmployeeDaoImpl(EntityManager entityManager)
	{
		this.entityManager=entityManager;
	}

    public List<Employee> findAll()
    {
    	Session sess=entityManager.unwrap(Session.class);
    	Query query=sess.createQuery("from Employee",Employee.class);
    	List<Employee> emps=query.getResultList();
    	return emps;
    }

	@Override
	public Employee findById(int theId)
	{
		Session sess=entityManager.unwrap(Session.class);
		 Employee emp=sess.find(Employee.class,theId);
				 
		return emp;
	}

	@Override
	public void save(Employee empId) 
	{
		Session sess=entityManager.unwrap(Session.class);
		 		
		sess.save(empId);
	}

	@Override
	public void deleteById(int theId) 
	{
		Session sess=entityManager.unwrap(Session.class);
		
		Query query=sess.createQuery("delete from Employee where id:employeeId");
		
		query.setParameter("employeeId",theId);
		
		query.executeUpdate();
		
	}




}
