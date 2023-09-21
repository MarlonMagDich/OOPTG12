package B00_Konstruktor;

public class ErzeugeSchueler {
    public static void main(String[] args) {
        Schueler s1 = new Schueler("Maier", "Max", "mm@web.de");
        Schueler s2 = new Schueler("Nagelsmann", "Julian");
        System.out.println(s1.name);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

    
}
