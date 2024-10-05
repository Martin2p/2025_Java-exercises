package SGD.OOP.Basics;

/* ######################################################
Einsendeaufgabe 5.1
###################################################### */
import javax.swing.*;

class Fernseher{

    int lautstaerke;
    int programm;
    boolean power = false;


    /***** Methoden *****/

    public void einschalten() {
        this.power = true;
        System.out.println("Der Fernseher ist eingeschaltet.");
    }

    public void ausschalten() {
        this.power = false;
        System.out.println("Der Fernseher ist ausgeschaltet.");
    }

    public String lautLeise(String lautstaerke) {
        if (power == true) {
            if (lautstaerke == "+") {
                System.out.println("Lautstärke +1");
            }
            if (lautstaerke == "-") {
                System.out.println("Lautstärke -1");
            }
        }
        else {System.out.println("Der Fernseher ist ausgeschaltet!");}

        return lautstaerke;
    }

    public int sender(int programm) {
        if (power == true) {
            programm = Integer.parseInt(JOptionPane.showInputDialog("Bitte Programmzahl eingeben:"));
            System.out.println("Das Programm " + programm + " wurde gewählt.");
        }
        else {System.out.println("Der Fernseher ist ausgeschaltet!");
        }
    return programm;
    }
}

public class Einsendeaufgabe_5_1 {

    public static void main(String[] args) {

        Fernseher martintv = new Fernseher();

        martintv.einschalten();

        martintv.sender(1);
        martintv.lautLeise("+");
        martintv.sender(1);
        martintv.lautLeise("-");
        martintv.sender(1);
        martintv.lautLeise("-");

        martintv.ausschalten();

        martintv.sender(0);
    }
}
