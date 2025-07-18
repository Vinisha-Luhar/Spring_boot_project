package com.springbootproject.spring_boot_project;

public class PaytmPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paytm Payment : "+amount);
    }
}
