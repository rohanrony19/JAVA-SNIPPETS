package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Payment;

public class CreditCard {
    private Payment payment;

    public CreditCard(Payment payment){
        this.payment=payment;
        System.out.println("Assigning payment instance ");
    }
    public void pay(){
        if(this.payment!=null){
            this.payment.paid();
            System.out.println("Running pay in creditcard");
        }else{
            System.out.println("Null");
        }
    }
}
