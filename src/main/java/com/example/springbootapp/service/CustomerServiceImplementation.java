package com.example.springbootapp.service;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootapp.entity.Customer;
import com.example.springbootapp.repo.Repository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
    private Repository custRepo;
	@Override
	public void createCustomer(String cName, String cItem, String cInvoice) {
		// TODO Auto-generated method stub
		Customer c=new Customer(cName,cItem,cInvoice);
		
		custRepo.save(c);	}

	@Override
	public ArrayList<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		ArrayList<Customer> custArray=(ArrayList<Customer>) custRepo.findAll();
		return custArray;
	}

	@Override
	public boolean authService(String headerValue) {
		String Base64Cred= headerValue.substring("Basic".length()).trim()	;
		byte[] credDecoded= Base64.getDecoder().decode(Base64Cred);// TODO Auto-generated method stub
		 String cred= new String(credDecoded, StandardCharsets.UTF_8);
		 //creds= uName:pwd
		 final String values[]=cred.split(":");
		 if(values[0]=="upadmin" && values[1]=="upadmin") {return true;}
		 else return false;
		
	}

}
