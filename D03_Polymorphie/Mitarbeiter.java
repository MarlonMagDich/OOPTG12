package D03_Polymorphie;

public class Mitarbeiter {
    private int stundenlohn;
    private int anzahlStunden;

    
    public Mitarbeiter(int stundenlohn, int anzahlStunden) {
        this.stundenlohn = stundenlohn;
        this.anzahlStunden = anzahlStunden;
    }


    public double berechneGehalt(){
        return anzahlStunden * stundenlohn;
    }
}
