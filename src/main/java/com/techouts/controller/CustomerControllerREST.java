package com.techouts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.dto.OrderRequest;
import com.techouts.entity.Customer;
import com.techouts.service.CustomerService;
import com.techouts.service.ProductInformationService;

@RestController
@CrossOrigin
@RequestMapping("/api")
@ComponentScan
public class CustomerControllerREST 
{
	
    @Autowired
	private CustomerService customerService;
   
	public CustomerControllerREST(CustomerService customerService)
	{
		this.customerService=customerService;
	}
	
	@RequestMapping(value="/customerSave",method = RequestMethod.POST)
	@ResponseBody
    public Customer addCustomer(@RequestBody Customer customer)
    {
		customerService.save(customer);
		return customer;
    }
	
	@RequestMapping(value = "/customers",method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> listAll()
	{
		return customerService.findAll();
	}
	
	@RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
	@ResponseBody
	public Optional<Customer> findById(@PathVariable final Integer id)
	{
	       return customerService.findById(id);
	}
	
	@ResponseBody
	@DeleteMapping(value = "/deleteMap/{id}")
	public void deleteById(@PathVariable(value="id")final Integer id)
	{
		customerService.deleteCustomerById(id);
	}
	
	

}
