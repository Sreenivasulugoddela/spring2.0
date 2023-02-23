package com.techouts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techouts.entity.Customer;

@Service
public interface CustomerService {

	   public List<Customer> findAll();
	   
	   public Optional<Customer> findById(Integer theId);
	  	   
	   public void deleteCustomerById(Integer theid);
      
	   public void save(Customer customer);
}
