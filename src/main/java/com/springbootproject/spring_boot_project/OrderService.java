package com.springbootproject.spring_boot_project;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
