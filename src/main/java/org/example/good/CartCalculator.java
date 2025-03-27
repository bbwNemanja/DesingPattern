package org.example.good;

public class CartCalculator {
    // Singleton-Instanz
    private static CartCalculator instance;

    // Privater Konstruktor verhindert direkte Instanziierung
    private CartCalculator() {}

    public static CartCalculator getInstance() {
        if (instance == null) {
            instance = new CartCalculator();
        }
        return instance;
    }

    // Methode, die den Einkaufswagen berechnet und ausgibt
    public void calculateAndPrintCart(String[] items, double[] prices, int[] quantities, double taxRate) {
        double sum = 0.0;
        for (int i = 0; i < items.length; i++) {
            double subtotal = prices[i] * quantities[i];
            sum += subtotal;
            System.out.println("Artikel: " + items[i] + " - Preis: " + prices[i]
                    + " - Menge: " + quantities[i] + " => Zwischensumme: " + subtotal);
        }
        double taxAmount = sum * taxRate;
        double total = sum + taxAmount;

        System.out.println("Gesamtsumme: " + sum);
        System.out.println("Umsatzsteuer (7%): " + taxAmount);
        System.out.println("Endbetrag: " + total);
    }
}
