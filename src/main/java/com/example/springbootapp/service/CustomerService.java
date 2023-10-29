package com.example.springbootapp.service;

import java.util.ArrayList;

import com.example.springbootapp.entity.Customer;

public interface CustomerService {
	
	public void createCustomer(String cName, String cItem, String cInvoice);
	public ArrayList<Customer> getAllCustomer();
	public boolean authService(String headerValue);

}
