package com.techouts.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;


@Entity
public class ProductInformation 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String productName;
	
	private String productRef;
	
	private Date productManfacturingDate;
	
	private int productQty;
	
	private int customerId;
	
	
	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public ProductInformation()
	{	
	}

	public ProductInformation(int productId, String productName, String productRef, Date productManfacturingDate
			,int customerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRef = productRef;
		this.productManfacturingDate = productManfacturingDate;
		this.customerId=customerId;
	}

	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductRef() {
		return productRef;
	}

	public void setProductRef(String productRef) {
		this.productRef = productRef;
	}

	public Date getProductManfacturingDate() {
		return productManfacturingDate;
	}

	public void setProductManfacturingDate(Date productManfacturingDate) {
		this.productManfacturingDate = productManfacturingDate;
	}

	@Override
	public String toString() {
		return "ProductInformation [productId=" + productId + ", productName=" + productName + ", productRef="
				+ productRef + ", productManfacturingDate=" + productManfacturingDate + ", productQty=" + productQty
				+ ", customerId=" + customerId + "]";
	}
	
}
