package com.springbootproject.spring_boot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootProjectApplication.class, args);
		var orderService= context.getBean(OrderService.class);
		orderService.setPaymentService(new PaytmPaymentService());
		orderService.placeOrder();
	}

}
