package D02_UebungOOP;

public class Dokumentarfilme extends Filme{
    private String beschreibung;

    public Dokumentarfilme(String pTitel) {
        super(pTitel);
        beschreibung=null;
    }    

    public Dokumentarfilme(String pTitel, String beschreibung) {
        super(pTitel);
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return super.toString() + ", Beschreibung: " + beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    
    
}
