package com.example.springbootapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String customerName;
	private String customerItem;
	private String customerInvoice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerItem() {
		return customerItem;
	}
	public void setCustomerItem(String customerItem) {
		this.customerItem = customerItem;
	}
	public String getCustomerInvoice() {
		return customerInvoice;
	}
	public void setCustomerInvoice(String customerInvoice) {
		this.customerInvoice = customerInvoice;
	}
	
	public Customer(String customerName, String customerItem, String customerInvoice) {
		super();
		this.customerName = customerName;
		this.customerItem = customerItem;
		this.customerInvoice = customerInvoice;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
