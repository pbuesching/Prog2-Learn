package patterns.TemplateMethod.Getraenke;

import java.util.Arrays;
import java.util.Random;

public abstract class Getraenk {

    int wasserTemp;
    String[] zutaten;
    int milliliter;

    public Getraenk() {
        wasserTemp = 15;
        zutaten = new String[4];
        milliliter = 1000;
    }

    public final void TemplateMethod() {
        wasserErhitzen();
        zutatenHinzufuegen();
        umruehren();
        umfuellen();
    }

    public void wasserErhitzen() {
        while (wasserTemp < 90) {
            Random rand = new Random();
            wasserTemp = wasserTemp + rand.nextInt(25) + 12;
            System.out.println("Wasser bei "+ wasserTemp +"°");
        }
        System.out.println("Wasser heiß genug");
    }

    public abstract void zutatenHinzufuegen();

    public void umruehren() {
        //TODO: Code zum durchmischen des Zutaten Arrays
        System.out.println("Getränk umgerührt");
    }

    public void umfuellen() {
        int tI = 0; //Tassen Index
        while (milliliter > 0) {
            //new Tasse
            milliliter =  milliliter - 250;
            System.out.println("Neue Tasse befüllt");
            tI++;
        }
        System.out.println("Die Kanne ist leer.\nEs wurden " + tI + " Tassen befüllt.");
    }
}

class Tee extends Getraenk {

    @Override
    public void zutatenHinzufuegen() {
        zutaten[0] = "Teebeutel";
        zutaten[1] = "Kräutermischung";
        zutaten[2] = "Apfelstückchen";
        System.out.println("Es wurden die Zutaten " + Arrays.toString(zutaten) + " hinzugefuegt");
    }
}

class Kaffee extends Getraenk {
    @Override
    public void zutatenHinzufuegen() {
        zutaten[0] = "Krümmelkaffee";
        zutaten[1] = "Milch";
        zutaten[2] = "Zucker";
        zutaten[3] = "Kakaopulver";
        System.out.println("Es wurden die Zutaten " + Arrays.toString(zutaten) + " hinzugefuegt");
    }
}
