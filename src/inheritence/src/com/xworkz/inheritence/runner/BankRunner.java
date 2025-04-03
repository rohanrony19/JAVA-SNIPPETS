package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bank.Bank;
import com.xworkz.inheritence.internal.bank.HDFCBank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new HDFCBank();
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interest();
        bank.atm();

        System.out.println("---------------");
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.deposit();
        hdfcBank.withdraw();
        hdfcBank.loan();
        hdfcBank.interest();
        hdfcBank.atm();

    }
}
