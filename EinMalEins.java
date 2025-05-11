package src;

public class EinMalEins {

	public static void main(String[] args) {
		
		//für das kleine 1x1 als Tabelle werden 10 zeilen und 10 Spalten benötigt
		int zeilen = 10;
		int spalten = 10;
		
		//2D-Array deklarieren und initialisieren mit den 10 Zeilen und 10 Spalten
		int[][] einMaleins = new int [zeilen][spalten];
	
		//Zeilen und Spalten per 2facher For-Schleife durchlaufen und mit Zahlen füllen
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {
				
				/*
				* Hier wird das eigentliche Ein mal Eins für jede Position im 2D-Array abgespeichert
				* 
				* Die Schleifenvariablen werden immer weiter miteinerander multipliziert 
				* bis das Maxium der Array-Grenzen erreicht ist:
				* 10x10 für die 10. Zeile und 10. Spalte
				* 
				* Es wird mit +1 für beide Schleifen-Indizies begonnen, andernfalls würde mit 0x0 
				* gestartet werden, da der Schleifenindex immer bei 0 startet.
				*/
				einMaleins[i][j] = (i + 1) * (j + 1);
			}
		}
		
		//Das 2D-Array als ganzes ausgeben lassen, ebenfalls per doppelter For-Schleife
		for (int i = 0; i < zeilen; i++) {
			for (int j = 0; j < spalten; j++) {
				
				//Ausgabe mit Tabulator-Anweisung, für den horizontalen Abstand -> Platz zwischen den Zahlen
				System.out.print(einMaleins[i][j] + "\t");
			}
			//in dieser äußeren Schleife eine Anweisung für neuen Zeilenumbruch
			//damit eine Tabellen-Ausdruck angezeigt wird
			System.out.println();
		}
	}
}
