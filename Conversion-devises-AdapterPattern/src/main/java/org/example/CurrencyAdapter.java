package org.example;

public interface CurrencyAdapter {
    /**
     * Convertit un montant d'une devise à une autre.
     *
     * @param fromUSD La devise source (ex : "USD").
     * @param toUSD La devise cible (ex : "EUR").
     * @param amount Le montant à convertir.
     * @return Le montant converti.
     */
    double convert(String fromUSD, String toUSD, double amount);
}
