package com.techouts.controller;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techouts.dto.OrderRequest;
import com.techouts.entity.Customer;
import com.techouts.entity.ProductInformation;
import com.techouts.service.ProductInformationService;

@RestController
@CrossOrigin
@RequestMapping("/productApi")
@ComponentScan
public class ProductControllerREST 
{
     
	private ProductInformationService productInformationService;
	
	public ProductControllerREST(ProductInformationService productInformationService)
	{
		this.productInformationService=productInformationService;
	}
	
	@RequestMapping(value = "/products",method = RequestMethod.POST)
	@ResponseBody
	public ProductInformation addProducts(@RequestBody ProductInformation productInformation)
	{
		productInformationService.save(productInformation);
		return productInformation;
	}
	
	@RequestMapping( value="/productInformationSave",method = RequestMethod.POST)
	@ResponseBody
	public ProductInformation productSave(@RequestBody ProductInformation productInformation)
	{
		productInformationService.save(productInformation);
		return productInformation;
	}
	
	@RequestMapping(value = "/productInformation",method = RequestMethod.GET)
	@ResponseBody
	public List<ProductInformation> listAll()
	{
		return productInformationService.findAll();
	}
	
	
	
}
