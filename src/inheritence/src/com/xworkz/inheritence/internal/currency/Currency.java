package com.xworkz.inheritence.internal.currency;

public class Currency {
    public Currency() {
        System.out.println("Running non-arg constructor Currency");
    }
    public void value() {
        System.out.println("Currency has a value");
    }
    public void exchangeRate() {
        System.out.println("Currency has an exchange rate");
    }
    public void country() {
        System.out.println("Currency belongs to a country");
    }
    public void symbol() {
        System.out.println("Currency has a symbol");
    }
    public void usedForTrade() {
        System.out.println("Currency is used for trade");
    }
}
