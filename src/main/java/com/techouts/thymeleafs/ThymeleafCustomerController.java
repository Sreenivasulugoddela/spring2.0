package com.techouts.thymeleafs;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.techouts.entity.Customer;

@RestController
public class ThymeleafCustomerController
{
 
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/customerSave",method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView save(@ModelAttribute Customer customer)
	{
		ModelAndView modelView=new ModelAndView();
		modelView.setViewName("customer-data");
		modelView.addObject("customer",customer);
	    return modelView;
	}
	
}
