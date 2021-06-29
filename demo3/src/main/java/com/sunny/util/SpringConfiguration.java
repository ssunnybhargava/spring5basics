package com.sunny.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sunny.repository.CustomerRepository;
import com.sunny.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean // Setter Injection
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}
	
	@Bean // Setter Injection
	public CustomerServiceImpl customerService() {
		
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCount(10);
		customerService.setRepository(customerRepository());
		return customerService;
		
	}
	
	

}
