package C00_Vererbung;

import java.util.ArrayList;

public class Startklasse{
    public static void main(String[] args) {
        Schueler s1 = new Schueler("Meier", "Max");
        Schueler s2 = new Schueler("Gigangungani", "Marlon", "marlon@marlonmagdich.de");

        //Alle Schüler in eine Liste

        ArrayList<Schueler> dieSchueler = new ArrayList<>();
        dieSchueler.add(s1);
        dieSchueler.add(s2);

        //Alle Schueler ausgeben
        for (Schueler schueler : dieSchueler) {
            System.out.println(schueler.getName());
        }
    }

}