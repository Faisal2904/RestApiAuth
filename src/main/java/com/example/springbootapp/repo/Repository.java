package com.example.springbootapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootapp.entity.Customer;

public interface Repository extends CrudRepository<Customer,Integer> {

}
