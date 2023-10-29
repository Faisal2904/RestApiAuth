package com.example.springbootapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapp.entity.Customer;
import com.example.springbootapp.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {
	@Autowired
	private CustomerService custSrvc;
	
	@GetMapping("Alive")
	public Boolean getCustomer() {
	
      return true;
	}
	@GetMapping(value="/getAllCustomer")
	public ArrayList<Customer> getAllCustomer() {
	 ArrayList<Customer> custArray=custSrvc.getAllCustomer();
      return custArray;
	}
	
	@PostMapping(value = "/createCustomer")
	public String createCustomer(@RequestBody Customer c) {
		custSrvc.createCustomer(c.getCustomerName(), c.getCustomerItem(), c.getCustomerInvoice());
		
		return "CustomerCreated";
	}
}
