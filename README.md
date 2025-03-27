# DesignPrinciple – Demonstration des DRY-Prinzips

## Einleitung

Das Projekt **DesignPrinciple** demonstriert das DRY-Prinzip ("Don't Repeat Yourself") anhand eines praktischen Beispiels: eines Einkaufswagen-Rechners. Es werden zwei Implementierungen vorgestellt, die beide denselben Output erzeugen.
- Im **Bad Example** wird das Prinzip durch mehrfach wiederholten Code verletzt.
- Im **Good Example** wird der DRY-Ansatz verfolgt, was zu wiederverwendbarem, wartbarem und erweiterbarem Code führt.

## Zweck des Projekts

- **Problemstellung:**  
  Wiederholter Code kann zu Fehlern, Inkonsistenzen und einem erhöhten Wartungsaufwand führen.

- **Lösung:**  
  Durch die Anwendung des DRY-Prinzips wird Wiederverwendbarkeit und eine klare Struktur gefördert, was zu einem robusteren und leichter pflegbaren Code führt.

- **Lernziel:**  
  Entwickler sollen den Nutzen und die praktische Anwendung von Best Practices in der Softwareentwicklung kennenlernen.

## Nutzen des Projekts

- **Bildungszweck:**  
  Das Projekt liefert ein anschauliches Beispiel, um die Bedeutung von sauberem und wartbarem Code zu demonstrieren.

- **Best Practices:**  
  Es zeigt, wie durch den Einsatz von Entwurfsmustern (z. B. Singleton) redundanter Code vermieden werden kann.

- **Fehlerminimierung:**  
  Die zentrale Logik reduziert potenzielle Fehlerquellen.

## Support

- **Hilfe & Fragen:**  
  Bei Problemen oder Fragen wenden Sie sich bei Nemanja.

  - **Allgemeine Fragen:**  
  Bei Allgemeinen Fragen können Sie sich auch bei Herr Gebert wenden beispielsweise, was DRY bedeutet oder anderen Theorie Fragen.

## Wartung und Verantwortlichkeit

Dieses Projekt wird von Nemanja gepflegt. Für Rückfragen oder weiterführende Informationen steht der Maintainer(Nemanja) zur Verfügung.

## Verwendung und Codebeispiele
Das Ziel beider Implementierungen ist es, den Einkaufswagen inklusive Zwischensummen pro Artikel, Gesamtsumme, Steuerbetrag (7%) und Endbetrag zu berechnen und auszugeben.

### Bad Example

Im Bad Example wird der Code für jeden Artikel einzeln geschrieben. Dadurch kommt es zu redundanten Codezeilen, wie im folgenden Auszug zu sehen:


```// Auszug aus BadMain.java
String item1 = "Apfel";
double price1 = 0.99;
int quantity1 = 3;
double subtotal1 = price1 * quantity1;
System.out.println("Artikel: " + item1 + " - Preis: " + price1
+ " - Menge: " + quantity1 + " => Zwischensumme: " + subtotal1);

// Es folgen ähnliche Codeblöcke für Banane, Milch und Brot.
```
## Good Example
Im Good Example wird das DRY-Prinzip umgesetzt, indem die Logik zentral in einer Methode zusammengefasst wird. Dadurch wird der Code wiederverwendbar und leicht wartbar. Zum Beispiel wird in der GoodMain-Klasse der Einkaufswagen über eine Singleton-Instanz der CartCalculator-Klasse berechnet:

```
// Auszug aus GoodMain.java
String[] items = {"Apfel", "Banane", "Milch", "Brot"};
double[] prices = {0.99, 0.59, 1.29, 2.49};
int[] quantities = {3, 5, 2, 1};
double taxRate = 0.07;

// Singleton-Instanz holen und Einkaufswagen berechnen
CartCalculator calculator = CartCalculator.getInstance();
calculator.calculateAndPrintCart(items, prices, quantities, taxRate);
```
Ein zentraler Bestandteil des DRY-Ansatzes ist die Methode calculateAndPrintCart in der CartCalculator-Klasse:

```
// Auszug aus CartCalculator.java
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
```
Diese zentrale Methode reduziert Wiederholungen und ermöglicht eine einfache Erweiterung oder Änderung der Berechnungslogik.

## Design Prinzip: DRY (Don't Repeat Yourself)
### Bad Example:
Wiederholt den Code für jeden Artikel, was zu erhöhter Fehleranfälligkeit und Wartungsaufwand führt.

### Good Example:
Konsolidiert die Logik in einer zentralen, wiederverwendbaren Methode und nutzt das Singleton-Muster, um die Instanzierung der Berechnungslogik zu kontrollieren.
Die Verwendung von Arrays und Schleifen (wie in calculateAndPrintCart) vermeidet unnötige Wiederholungen.

## Fazit
Das Projekt DesignPrinciple verdeutlicht, wie wichtig es ist, Code-Duplikationen zu vermeiden und stattdessen wiederverwendbare Komponenten zu erstellen. Der Vergleich zwischen dem Bad Example und dem Good Example zeigt, dass die Einhaltung von Design-Prinzipien wie DRY nicht nur die Lesbarkeit, sondern auch die Wartbarkeit und Erweiterbarkeit des Codes signifikant verbessert.