package org.example;

public class PaymentWay {
    PaymentProcessor paymentProcessor;
    public PaymentWay(PaymentProcessor obj){
        this.paymentProcessor = obj;
    }

    public void payAmountUsingCard(double amount){
        paymentProcessor.doPayment();
    }

}
