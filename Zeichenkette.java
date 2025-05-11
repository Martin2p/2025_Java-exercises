package src;

import java.util.Scanner;

public class Zeichenkette {

	public static void main(String[] args) {
		
		//neuer Scanner für Benutzereingabe
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hallo! Bitte beliebige Zeichen eingeben: ");
		
		//Einlesen der Benutzereingabe
		String eingabe = scanner.nextLine();
		
		//Falls keine Zeichen eingebenen wurden
		if (eingabe.isEmpty()) {
			System.out.println("Keine Eingabe erkannt!");
			//Scanner schließen
			scanner.close();
		}
		
		//Zählvariable für Konsonanten
		int konsonanten = 0;
		
		//Zählvariable für Vokale
		int vokale = 0;
		
		//For-Schleife zum durchlaufen der Zeichenkette
		for (int i = 0; i < eingabe.length(); i++) {
		
			//als erstes Umwandlung aller Zeichen in Kleinbuchstaben
			char zeichen = Character.toLowerCase(eingabe.charAt(i));
			
			//Switch-Case Anweisung für die Vokale und Konsonanten
			switch (zeichen) {
				case 'a': 
					vokale++;
					break;
				case 'e': 
					vokale++;
					break;
				case 'i': 
					vokale++;
					break;
				case 'o': 
					vokale++;
					break;
				case 'u': 
					vokale++;
					break;
				default:
					konsonanten++;
			}
		}
		
		//Ausgabe
		System.out.println("Eingegebener Text: " + eingabe);
		System.out.println("Anzahl der Selbstlaute/Vokale: " + vokale);
		System.out.println("Anzahl der Konsonanten: " + konsonanten);

		//Scanner schließen
		scanner.close();
	}
}
