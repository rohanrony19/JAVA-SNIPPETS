package com.xworkz.inheritancetypes.multi;

class Account {
        void open() {
            System.out.println("Opening account"); }
    }

    class BankAccount extends Account {
        void deposit() {
            System.out.println("Depositing money"); }
    }

    public class SavingsAccount extends BankAccount {
        void earnInterest() {
            System.out.println("Earning interest on savings"); }
}
