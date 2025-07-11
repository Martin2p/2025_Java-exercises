package src;

import java.util.Scanner;

public class ZahlenEinleser {

	public static void main(String[] args) {
		
		///neuer Scanner für Benutzereingabe
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hallo! Bitte zwei ganze Zahlen eingeben: ");
		
		//2 Variablen per Benutzereingabe über die Konsole initialisieren
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		
		//Zählervariable für Anzahl der Schleifendurchläufe 
		int zaehler = 0;
		
		//Bedingungen:
		if (a > b) {
			//Durchschleifen wenn b kleiner als a ist wird bis einschl.a aufgezählt
			for (int i = b; i <= a; i++) {
				System.out.println(i);
				//Zählervariable um 1 erhöhen pro Durchlauf
				zaehler++;
			}
			System.out.println("Anzahl der Durchläufe: " + zaehler);
		}
		if (a < b) {
			//Durchschleifen wenn a kleiner als b ist wird bis einschl. b aufgezählt
			for (int i = a; i <= b; i++) {
				System.out.println(i);
				//Zählervariable um 1 erhöhen pro Durchlauf
				zaehler++;
			}
			System.out.println("Anzahl der Durchläufe: " + zaehler);
		}
		if (a == b) {
			System.out.println("Beide Zahlen sind gleich groß!");
		}
		scanner.close();
	}
}
