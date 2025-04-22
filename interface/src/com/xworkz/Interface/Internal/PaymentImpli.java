package com.xworkz.Interface.Internal;

public class PaymentImpli implements Payment{

    public PaymentImpli(){
        System.out.println("No arg constructor in PaymentImpli");
    }
    @Override
    public void paid() {
        System.out.println("overriding paid in paymentimpli ");
    }
}
