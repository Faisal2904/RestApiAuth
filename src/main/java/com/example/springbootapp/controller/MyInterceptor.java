package com.example.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.springbootapp.service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor  implements HandlerInterceptor{
    @Autowired
    private CustomerService custSrvc;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("inPrehandle");
		String basicAuthValue = request.getHeader("authorization");
		boolean res= custSrvc.authService(basicAuthValue);
		if (res!=true) {
			response.setStatus(HttpStatus.UNAUTHORIZED.value());
		}
		return res;
		// TODO Auto-generated method stub
		
	}

}
