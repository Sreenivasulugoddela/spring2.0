package com.techouts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.techouts.entity.ProductInformation;
import com.techouts.repository.ProductInformationRepo;
@Service
@Repository
public class ProductInformationImpl implements ProductInformationService
{ 
   
	private  ProductInformationRepo repo;
	
	public ProductInformationImpl(ProductInformationRepo repo)
	{
		this.repo=repo;
	}

	@Override
	public List<ProductInformation> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<ProductInformation> findByIdProduct(Integer theId) {
		return repo.findById(theId);
	}

	@Override
	public void save(ProductInformation proInfo) {
		repo.save(proInfo);
		
	}

	@Override
	public void deleteCustomerById(Integer theid) {
       
		repo.deleteById(theid);
	}
	
	
}
