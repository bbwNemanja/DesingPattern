# README
 
Dieses Projekt erläutert das zugrunde liegende Designprinzip sowie das verwendete Design Pattern anhand von zwei Implementierungen – einem "Bad"-Beispiel und einem "Good"-Beispiel. Anhand dieser Beispiele wird aufgezeigt, wie das DRY-Prinzip (Don't Repeat Yourself) eingehalten bzw. verletzt wird und warum das Singleton Pattern eine passende Lösung darstellt.
 
---
 
## 1. Designprinzip: DRY (Don't Repeat Yourself)
 
**Was ist DRY?**  
Das DRY-Prinzip besagt, dass sich Logik, Informationen oder Daten im Code nicht wiederholen sollen. Jede einzelne Wissenseinheit sollte nur einmal vorhanden sein. Dies fördert:
 
- **Wartbarkeit:** Änderungen müssen nur an einer Stelle vorgenommen werden.
- **Konsistenz:** Einheitliche Logik reduziert Inkonsistenzen.
- **Fehlerreduktion:** Weniger duplizierter Code mindert das Risiko von Fehlern.
- **Erweiterbarkeit:** Neue Funktionalitäten können einfacher integriert werden, da vorhandene Logik wiederverwendet wird.
 
---
 
## 2. Verwendetes Design Pattern: Singleton
 
**Was ist das Singleton Pattern?**  
Das Singleton Pattern stellt sicher, dass von einer Klasse nur eine einzige Instanz existiert und bietet einen globalen Zugriffspunkt auf diese Instanz. Dies ist besonders nützlich, wenn zentralisierte Logik oder gemeinsame Ressourcen benötigt werden.
 
**Warum wurde das Singleton Pattern gewählt?**  
Im "Good"-Beispiel wird das Singleton Pattern in der Klasse `CartCalculator` implementiert. Dies bringt folgende Vorteile mit sich:
 
- **Zentralisierte Logik:** Alle Berechnungen und Ausgaben des Einkaufswagens sind in einer einzigen Klasse zusammengefasst.
- **Einheitlichkeit:** Es wird sichergestellt, dass immer dieselbe Instanz verwendet wird, was inkonsistente Zustände verhindert.
- **Ressourcenschonung:** Keine unnötigen Mehrfachinstanzen werden erstellt, was den Speicherverbrauch reduziert.
 
---
 
## 3. Analyse der Code-Beispiele
 
### Good Example
 
- **Einhaltung des DRY-Prinzips:**  
  - Die `CartCalculator`-Klasse kapselt die gesamte Logik zur Berechnung und Ausgabe des Warenkorbs.
  - Mit Hilfe von Arrays und einer Schleife wird für alle Artikel eine einheitliche Berechnung durchgeführt.
  - Änderungen an der Berechnungslogik müssen nur in der Methode `calculateAndPrintCart` vorgenommen werden, was den Code wartbarer und erweiterbarer macht.
 
- **Singleton Pattern:**  
  - Durch die private Konstruktor-Methode und die `getInstance()`-Methode wird sichergestellt, dass nur eine Instanz der `CartCalculator`-Klasse existiert.
  - Diese zentrale Instanz wird im gesamten Programm genutzt, um Konsistenz zu gewährleisten.
 
### Bad Example
 
- **Verletzung des DRY-Prinzips:**  
  - Der Code berechnet und gibt für jeden Artikel einzeln den Preis, die Menge und die Zwischensumme aus.  
  - Wiederholte Codeabschnitte für jeden Artikel führen zu unnötiger Redundanz.
  - Jede Änderung in der Berechnungslogik müsste an mehreren Stellen vorgenommen werden, was das Risiko von Fehlern und Inkonsistenzen erhöht.
 
- **Fehlende zentrale Logik:**  
  - Es existiert keine zentrale Methode oder Klasse, die die Einkaufswagenlogik zusammenfasst.
  - Die Berechnungen und Ausgaben sind im Hauptprogramm dupliziert, was die Lesbarkeit und Wartbarkeit verschlechtert.
 
---
 
## 4. Zusammenfassung
 
- **DRY-Prinzip:**  
  Das DRY-Prinzip ist essenziell, um redundanten Code zu vermeiden. Dies führt zu einer besseren Wartbarkeit, geringeren Fehleranfälligkeit und einer insgesamt konsistenteren Codebasis. Im "Good"-Beispiel wird dieses Prinzip durch die zentrale Methode `calculateAndPrintCart` eingehalten, während im "Bad"-Beispiel redundante Codeabschnitte zu sehen sind.
 
- **Singleton Pattern:**  
  Das Singleton Pattern stellt sicher, dass es nur eine Instanz des Warenkorb-Rechners gibt, was eine konsistente und zentrale Logik ermöglicht. Dies reduziert den Overhead, mehrere Instanzen zu verwalten, und sorgt für eine einheitliche Verarbeitung der Einkaufswagenberechnung.
 
- **Vorteile der guten Umsetzung:**  
  - **Wiederverwendbarkeit:** Änderungen erfolgen zentral.
  - **Lesbarkeit und Wartbarkeit:** Eine zentrale Logik ist leichter zu verstehen und zu pflegen.
  - **Konsistenz:** Ein einziger Zugriffspunkt minimiert das Risiko unterschiedlicher Zustände.
 
Dieses README zeigt, wie die Einhaltung des DRY-Prinzips und die Verwendung des Singleton Patterns zu einem saubereren, wartbareren und konsistenteren Code führen. Die "Good"-Implementierung demonstriert klar, wie durch Reduktion von Wiederholungen und durch die zentrale Steuerung über ein Singleton die Softwarequalität verbessert wird.

---
 
## 5. Github

git clone https://github.com/bbwNemanja/DesingPattern.git