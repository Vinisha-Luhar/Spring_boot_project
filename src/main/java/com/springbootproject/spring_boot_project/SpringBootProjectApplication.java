package com.springbootproject.spring_boot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootProjectApplication.class, args);
		var orderService=new OrderService();
		orderService.setPaymentService(new PaytmPaymentService());
		orderService.placeOrder();
	}

}
