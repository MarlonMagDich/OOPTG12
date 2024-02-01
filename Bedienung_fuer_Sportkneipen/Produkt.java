package Bedienung_fuer_Sportkneipen;

public class Produkt {

    private double aPreis;
    private String aBezeichnung;
    private int aProdNr;

    public Produkt(int pNummer, String pBezeichnung, double pPreis) {
        aPreis = pPreis;
        aBezeichnung = pBezeichnung;
        aProdNr = pNummer;
    }
    


    public double getPreis() {
        return aPreis;
    }
    
    public String getBezeichnung() {
        return aBezeichnung;
    }
}
