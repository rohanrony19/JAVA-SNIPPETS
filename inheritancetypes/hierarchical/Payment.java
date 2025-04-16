package com.xworkz.inheritancetypes.hierarchical;

public class Payment {
        void transact() { System.out.println("Transaction in progress"); }
    }

    class CreditCard extends Payment {
        void payLater() { System.out.println("Payment via credit card"); }
    }

    class DebitCard extends Payment {
        void payNow() { System.out.println("Payment via debit card"); }
    }

    class UPI extends Payment {
        void instantPay() { System.out.println("Instant UPI payment");
    }

}
