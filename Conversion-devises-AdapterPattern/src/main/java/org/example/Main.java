package org.example;

public class Main {
    public static void main(String[] args) {

        CurrencyAdapter currencyAdapter = new CurrencyAdapterImpl();


        System.out.println("Sell 100 EUR : " + currencyAdapter.convert("EUR", "USD", 100) + "$");
        System.out.println("Sell 100 GBP : " + currencyAdapter.convert("GBP", "USD", 100) + "$");

        System.out.println("Buy EUR : " + currencyAdapter.convert("USD", "EUR", 100) + "€");
        System.out.println("Buy GBP : " + currencyAdapter.convert("USD", "GBP", 100) + "£");

    }
}
