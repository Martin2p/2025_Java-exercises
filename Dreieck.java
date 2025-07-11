package src;

import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Gleichschenkliges Dreieck! \n Bitte die Höhe eingeben: ");
		
		//die Höhe des Dreiecks durch Benutzereingabe
		int hoehe = Integer.parseInt(eingabe.nextLine());
		
		/*
		 * Äußere Schleife:
		 * Die Zählvariable i steht für die aktuelle Zeile und beginnt hier mit 1.
		 * Diese Zeile wird ausgegeben bis i dem Wert der Höhe entspricht.
		 */
		 for(int i = 1; i <= hoehe; i++) {

			/*
			 * 1. innere Schleife für die Leerzeichen:
			 * 
			 * Fügt (hoehe - i) Leerzeichen ein, um die Sterne zu zentrieren.
			 * 
			 * Dadurch dass der steigende i-Wert von der Höhe abgezogen wird,
			 * wird j immer kleiner während es per ++ immer weiter wandert.
			 * 
			 * Für jede Anzahl von j wird in der ausgegeben Zeile der äußeren Schleife 
			 * ein Leerzeichen ausgegeben.
			 * 
			 */
			for (int j = 1; j <= hoehe - i; j++) {
				System.out.print(" ");
			}
			
			/*
			 * 2. innere Schleife für die Sterne
			 * 
			 * Zusätzlich zur Schleife für die Leerzeichen, läuft eine 2. Schleife welche "parallel" die
			 * Anzahl der Sterne in Abhängigkeit der eingegebenen Höhe angibt.
			 * 
			 * Die Bedingung ist hier dass k kleiner oder gleich einer ungeraden Anzahl (2 * i - 1)  entspricht.
			 * Damit ein zentriertes Dreieck entsteht und jede Zeile eine ungerade Anzahl hat.
			 * 
			 * Dadurch dass der i-Wert steigt steigt auch k, dadurch wächst die Anzahl 
			 * der Sterne bis die Ziel-Bedingung erfüllt ist.
			 */
			for (int k = 1; k <= (2 * i-1 ); k++) {
				System.out.print("*");
			}
			
			//Zeilenausgabe der äußeren Schleife
			System.out.println();
		}

		eingabe.close();
	}
}
