package D03_Polymorphie;

public class Startklasse {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter(14, 10);
        Mitarbeiter a1 = new Abteilungsleiter(120, 40);
        System.out.println("Gehalt Mitarbeiter:"+m1.berechneGehalt());
        System.out.println("Gehalt Abteilungsleiter:"+a1.berechneGehalt());
    }
}
