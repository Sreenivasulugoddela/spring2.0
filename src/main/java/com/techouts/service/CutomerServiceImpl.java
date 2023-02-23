package com.techouts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.techouts.entity.Customer;
import com.techouts.repository.CustomerRepository;

@Service
@Repository
public  class CutomerServiceImpl implements CustomerService
{
     
	private CustomerRepository repo;
	
	public CutomerServiceImpl(CustomerRepository repo)
	{
		this.repo=repo;
	}

	public List<Customer> findAll() 
	{
		return repo.findAll();
	}

	public Optional<Customer> findById(Integer theId) 
	{
		return repo.findById(theId);
	}

	public void save(Customer customer) 
	{
	     repo.save(customer);
	}

	public void deleteCustomerById(Integer  theid)
	{
			repo.deleteById(theid);		
	}

}
