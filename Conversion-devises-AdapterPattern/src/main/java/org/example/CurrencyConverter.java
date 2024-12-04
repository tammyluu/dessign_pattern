package org.example;

public class CurrencyConverter {

    /**
     * Convertit un montant depuis une devise donnée vers USD.
     *
     * @param currentDevise La devise source (ex : "EUR", "GBP").
     * @param amount Le montant à convertir.
     * @return Le montant converti en USD.
     */
    public double convertToUSD(String currentDevise, double amount) {
        switch (currentDevise.toUpperCase()) {
            case "EUR":
                return amount * 1.1;
            case "GBP":
                return amount * 1.3;
            default:
                throw new IllegalArgumentException("Devise non supportée : " + currentDevise);
        }
    }

    /**
     * Convertit un montant depuis USD vers une devise donnée.
     *
     * @param currentDevise La devise cible (ex : "EUR", "GBP").
     * @param amount Le montant en USD à convertir.
     * @return Le montant converti dans la devise cible.
     */
    public double convertFromUSD(String currentDevise, double amount) {
        switch (currentDevise.toUpperCase()) {
            case "EUR":
                return amount * 0.90;
            case "GBP":
                return amount * 0.75;
            default:
                throw new IllegalArgumentException("Devise non supportée : " + currentDevise);
        }
    }
}

