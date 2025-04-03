package com.xworkz.inheritence.internal.bank;

public class Bank {
    public Bank() {
        System.out.println("Running non-arg constructor Bank");
    }
    public void deposit() {
        System.out.println("Deposit money in bank");
    }
    public void withdraw() {
        System.out.println("Withdraw money from bank");
    }
    public void loan() {
        System.out.println("Bank provides loans");
    }
    public void interest() {
        System.out.println("Bank gives interest on savings");
    }
    public void atm() {
        System.out.println("Bank provides ATM service");
    }
}
