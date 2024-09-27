package org.example;

public class DebitCard implements PaymentProcessor{

    @Override
    public void doPayment() {
        System.out.println("debit card payment");
    }
}
