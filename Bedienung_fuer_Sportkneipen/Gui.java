package Bedienung_fuer_Sportkneipen;

public class Gui {

    Steuerung dieSteuerung;

    public Gui(Steuerung pSteuerung) {
        dieSteuerung = pSteuerung;
    }

    public void clickedBestellen(){

        //lesen eingegebener werte
        int tischNr = 1;
        int persNr = 1;
        int prodNr = 1;

        dieSteuerung.bestellen(tischNr,persNr,prodNr);
    }

    public void anzeigenBestellposition(int persNr, int prodNr, String bezeichnung, double preis) {

        System.out.println("Bestellposition: " + persNr + " " + prodNr + " " + bezeichnung + " " + preis);

    }
}
