package src;

import java.util.Scanner;

public class Grundstueckspreis {

	public static void main(String[] args) {
		
		///neuer Scanner für Benutzereingabe
		Scanner scanner = new Scanner(System.in);
        
		//Quadratmeterpreis, Fläche, Provision und Mehrwertsteuer als Double deklarieren, 
        double preisQm, flaeche;
		
        //Provision 5%
		final double PROVISION = 1.05;
		
		//Mehrwertsteuer 19%
		final double MWST = 1.19;

		System.out.println("Hallo! Bitte die Grundstuecksabmessungen eingeben in Metern: ");
		
		//Grundstuecksvariablen und Preis initialisieren per Benutzereingabe über die Konsole
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		
		//0-Werte abfangen
		if (a == 0 || b == 0) {
			System.out.println("0 ist kein zulässiger Wert!");
			scanner.close();
			return;
		}
			
		System.out.println("Jetzt bitten den Quadratmeterpreis in Euro angeben.");

		//Quadratmeterpreis abfragen
		preisQm = Integer.parseInt(scanner.nextLine());

		//Flächenberechnung
		flaeche = a * b;
		
		//Grundstueckspreis berechnen
		double preisGrundst = preisQm * flaeche;
				
		//Provisionsaufschlag berechnen
		double aufschlag = preisGrundst * PROVISION;
			
		//finaler Grundstueckspreis inkl. Provision und Mehrwertsteuer
		double finalPreis = aufschlag * MWST;
			
		//Ergebnisse ausgeben
		System.out.println("Die Grundstruecksflaeche betraegt: " + flaeche + " qm.");
		System.out.println("Der vorläufige Preis für das Grundstueck betraegt: " + preisGrundst + " €.\n");
		System.out.println("Der finale Grundstueckspreis inkl. Provision und Mehrwehrtsteuer betraegt: " + finalPreis + " €");
	
		//Scanner schließen
		scanner.close();
	}
}
