package com.example.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class myInterceptorAppConfig implements WebMvcConfigurer  {
  @Autowired
  MyInterceptor myIntrcptr;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
	registry.addInterceptor(myIntrcptr);
	}

}
