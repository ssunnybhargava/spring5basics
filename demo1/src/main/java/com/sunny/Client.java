package com.sunny;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sunny.service.CustomerServiceImpl;
import com.sunny.util.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
    	CustomerServiceImpl service = null;
    	
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	
    	service = (CustomerServiceImpl) context.getBean("customerService");
    	System.out.println(service.createCustomer());
    	context.close();
    }
}
