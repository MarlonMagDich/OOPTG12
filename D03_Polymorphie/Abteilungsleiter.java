package D03_Polymorphie;

public class Abteilungsleiter extends Mitarbeiter{

    private double zulage;

    public Abteilungsleiter(int stundenlohn, int anzahlStunden) {
        super(stundenlohn, anzahlStunden);
        zulage = 100;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt()+zulage;
    }

}
