package com.springbootproject.spring_boot_project;

public class GooglePaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Google Payment : "+amount);
    }
}
