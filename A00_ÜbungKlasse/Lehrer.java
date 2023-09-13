package A00_ÜbungKlasse;

/**
 * Lehrer
 */
class Lehrer {
    //Erstellt die 
    private String kuerzel;


    private String name;


    //Konstruktor
    public Lehrer(){
        kuerzel = "hr";
        name = "Hammer";
    }
    //Gibt den Privaten Wert von kuerzel im Konstruktor von Lehrer als public wert in der Methode getKuerzel aus
    public String getKuerzel() {
        return kuerzel;
    }

    public String getName() {
        return name;
    }
    // this is objektattribut damit man es unterscheiden kann
    public void setKuerzel(String neueskuerzel) {
        if (neueskuerzel.length()==2) {
            this.kuerzel = neueskuerzel;
        }
    }


    
}