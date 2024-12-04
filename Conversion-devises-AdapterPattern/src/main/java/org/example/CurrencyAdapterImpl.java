package org.example;

public class CurrencyAdapterImpl implements CurrencyAdapter {
    private final CurrencyConverter currencyConverter;

    /**
     * Constructeur qui initialise le CurrencyConverter.
     */
    public CurrencyAdapterImpl() {
        this.currencyConverter = new CurrencyConverter();
    }

    /**
     * Convertit un montant d'une devise source à une devise cible.
     *
     * @param fromCurrency La devise source (ex : "EUR").
     * @param toCurrency La devise cible (ex : "USD").
     * @param amount Le montant à convertir.
     * @return Le montant converti.
     */
    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equalsIgnoreCase(toCurrency)) {
            return amount;
        }
        if (toCurrency.equalsIgnoreCase("USD")) {
            return currencyConverter.convertToUSD(fromCurrency, amount);
        }
        if (fromCurrency.equalsIgnoreCase("USD")) {
            return currencyConverter.convertFromUSD(toCurrency, amount);
        }
        throw new IllegalArgumentException("Conversion directe between " + fromCurrency + " and " + toCurrency + " not supported.");
    }
}

