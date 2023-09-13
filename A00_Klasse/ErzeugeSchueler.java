
/**
 * ErzeugeSchueler
 */

public class ErzeugeSchueler {

    public static void main(String[] args) {
        //Schueler Objekt erzeugen
        Schueler s1 = new Schueler();

        //Nachteil direkter Zugriff, kann direkt bearbeitet werden
        //s1.groesse = -5;

        //Zugriff auf das Objekt
        System.out.println(s1.getName());
        System.out.println(s1.getGroesse());


    }

}