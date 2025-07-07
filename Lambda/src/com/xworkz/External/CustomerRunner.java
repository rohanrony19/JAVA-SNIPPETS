package com.xworkz.External;

import com.xworkz.Internal.Bottle;
import com.xworkz.Internal.Customer;

public class CustomerRunner {
    public static void main(String[] args) {
//        Bottle bottle = (int num)->{
//            System.out.println("running Lambda : " + num);
//            if(num>0){
//                return true;
//            }
//            return false;
//        };
        Customer customer = new Customer();
//        customer.buy(bottle);
        customer.buy((int num)->num>0);
    }
}
