package com.techouts.dto;

import javax.annotation.sql.DataSourceDefinition;

import com.techouts.entity.Customer;


public class OrderRequest 
{
  
	public Customer customers;

	public OrderRequest(Customer customers) {
		super();
		this.customers = customers;
	}

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "OrderRequest [customers=" + customers + "]";
	}
	
	
}
