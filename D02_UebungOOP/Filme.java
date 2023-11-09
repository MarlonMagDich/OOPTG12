package D02_UebungOOP;

public class Filme {
    private String titel;
    private int dauer;

    public Filme(String pTitel) {
        titel = pTitel;
    }

    

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) throws FilmTitelZuKurzException {
        if (titel.length()>2) {
            this.titel = titel;
        } else {
           throw new FilmTitelZuKurzException();
        }
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }



    @Override
    public String toString() {
        return "Titel=" + titel + ", Dauer=" + dauer;
    }

        

    

    
}
