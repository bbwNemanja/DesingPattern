package org.example.bad;

public class BadMain {
    public static void main(String[] args) {
        System.out.println("=== Einkaufswagen (Bad Example) ===\n");

        // Artikel 1
        String item1 = "Apfel";
        double price1 = 0.99;
        int quantity1 = 3;
        double subtotal1 = price1 * quantity1;
        System.out.println("Artikel: " + item1 + " - Preis: " + price1 + " - Menge: " + quantity1 + " => Zwischensumme: " + subtotal1);

        // Artikel 2
        String item2 = "Banane";
        double price2 = 0.59;
        int quantity2 = 5;
        double subtotal2 = price2 * quantity2;
        System.out.println("Artikel: " + item2 + " - Preis: " + price2 + " - Menge: " + quantity2 + " => Zwischensumme: " + subtotal2);

        // Artikel 3
        String item3 = "Milch";
        double price3 = 1.29;
        int quantity3 = 2;
        double subtotal3 = price3 * quantity3;
        System.out.println("Artikel: " + item3 + " - Preis: " + price3 + " - Menge: " + quantity3 + " => Zwischensumme: " + subtotal3);

        // Artikel 4
        String item4 = "Brot";
        double price4 = 2.49;
        int quantity4 = 1;
        double subtotal4 = price4 * quantity4;
        System.out.println("Artikel: " + item4 + " - Preis: " + price4 + " - Menge: " + quantity4 + " => Zwischensumme: " + subtotal4);

        double sum = subtotal1 + subtotal2 + subtotal3 + subtotal4;
        double taxRate = 0.07;
        double taxAmount = sum * taxRate;
        double total = sum + taxAmount;

        System.out.println("Gesamtsumme: " + sum);
        System.out.println("Umsatzsteuer (7%): " + taxAmount);
        System.out.println("Endbetrag: " + total);
    }
}
