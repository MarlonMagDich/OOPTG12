package Bedienung_fuer_Sportkneipen;

public class Steuerung {

    Gui dieGui;

    Tisch[] derTisch;
    Produkt[] dasProdukt;


    public Steuerung() {
        derTisch = new Tisch[10];
        dasProdukt = new Produkt[6];
        dieGui = new Gui(this);

        dasProdukt[0] = new Produkt(1, "Cola", 1.80);
    }

    public void bestellen(int tischNr, int persNr, int prodNr) {
        derTisch[tischNr].bestellen(persNr, dasProdukt[prodNr]);

        double preis = dasProdukt[prodNr].getPreis();

        String bezeichnung = dasProdukt[prodNr].getBezeichnung();

        dieGui.anzeigenBestellposition(persNr,prodNr, bezeichnung, preis);
        
    }
    
}
