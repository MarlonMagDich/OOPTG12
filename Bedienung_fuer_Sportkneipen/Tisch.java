package Bedienung_fuer_Sportkneipen;

import java.util.ArrayList;
import java.util.List;

public class Tisch {
    List<Bestellposition> dieBestellpositionen;

    public Tisch() {
        dieBestellpositionen = new ArrayList<Bestellposition>();
    }

    public void bestellen(int persNr, Produkt dasProdukt) {
        dieBestellpositionen.add(new Bestellposition(persNr, dasProdukt));
    }
}
