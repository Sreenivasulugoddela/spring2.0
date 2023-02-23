package com.techouts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.techouts.entity.Customer;
import com.techouts.entity.ProductInformation;

public interface ProductInformationService 
{
   
	public List<ProductInformation> findAll();
	
	public Optional<ProductInformation> findByIdProduct(Integer theId);
	   
	   public void save(ProductInformation proInfo);
	   
	   public void deleteCustomerById(Integer theid);

	   
}
