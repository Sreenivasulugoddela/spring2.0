package com.techouts.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer 
{
	@Id
	@Column(name="customerId")
	private Integer  customerId;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="customerRef")
	private String customerRef;
	
	@Column(name="customerEmail")
	private String customerEmail;
	
	@OneToMany(targetEntity = ProductInformation.class,cascade = CascadeType.ALL)
	@JoinColumn(name="customerId",referencedColumnName = "customerId")
	private List<ProductInformation> products;
	 
	
	public Customer()
	{
		
	}
	public Customer(int customerId, String customerName, String customerRef, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerRef = customerRef;
		this.customerEmail = customerEmail;
	}

	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerRef=" + customerRef
				+ ", customerEmail=" + customerEmail + "]";
	}
	
}
