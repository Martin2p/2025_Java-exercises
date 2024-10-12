package SGD.OOP.Fortgeschritten.Einsendeaufgaben;

/* ################################################
Aufgabe 5
################################################# */

class Insekt {

    int laenge;
    int gewicht;

    //Konstruktor:
    Insekt(int laenge, int gewicht) {
        this.laenge = laenge;
        this.gewicht = gewicht;
    }

    //Methode zum Essen:
    void essen() {
        laenge = laenge + 1;
        gewicht = gewicht + 1;
    }

    void ausgabe() {
        System.out.println("Das Insekt ist " + laenge + " cm lang und wiegt " + gewicht + " Gramm.");
    }
}

class Biene extends Insekt {
    int geschwindigkeit;

    //Konstruktor
    Biene(int laenge, int gewicht,int geschwindigkeit) {
        super(laenge, gewicht);
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    void ausgabe() {
        super.ausgabe();
        System.out.println("Die Geschwindigkeit beiträgt " + geschwindigkeit + " km/h.");
    }
}


public class Aufgabe_5 {

    public static void main(String[] args) {
        Insekt flipp = new Insekt(10, 30);
        Biene maja = new Biene(5, 10, 10);

        flipp.ausgabe();
        maja.ausgabe();
    }
}
