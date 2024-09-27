package org.example;

public class CreditCard implements PaymentProcessor{

    @Override
    public void doPayment() {
        System.out.println("credit card payment");
    }
}
