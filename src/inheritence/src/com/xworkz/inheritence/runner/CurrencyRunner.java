package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.currency.Currency;
import com.xworkz.inheritence.internal.currency.Dollar;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Dollar();
        currency.value();
        currency.exchangeRate();
        currency.country();
        currency.symbol();
        currency.usedForTrade();

        System.out.println("-----------");

        Dollar dollar = new Dollar();
        dollar.value();
        dollar.exchangeRate();
        dollar.country();
        dollar.symbol();
        dollar.usedForTrade();
    }
}
