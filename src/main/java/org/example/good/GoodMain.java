package org.example.good;

public class GoodMain {
    public static void main(String[] args) {
        System.out.println("=== Einkaufswagen (Good Example) ===\n");

        String[] items = {"Apfel", "Banane", "Milch", "Brot"};
        double[] prices = {0.99, 0.59, 1.29, 2.49};
        int[] quantities = {3, 5, 2, 1};
        double taxRate = 0.07;

        // Singleton-Instanz holen und Einkaufswagen berechnen
        CartCalculator calculator = CartCalculator.getInstance();
        calculator.calculateAndPrintCart(items, prices, quantities, taxRate);
    }
}
