package D02_UebungOOP;

import java.util.ArrayList;

public class Startfilme {
    public static void main(String[] args) {
        Filme nemo = new Filme("nemo");
        Trickfilme peanuts = new Trickfilme("Peanuts", 12);
        Dokumentarfilme terrax = new Dokumentarfilme("Terra X", "Entstehung der Erde");
        //Exception überprüfen
        try {
            nemo.setTitel("findet nemo");
        } catch (FilmTitelZuKurzException e) {
            e.printStackTrace();
        }

        ArrayList<Filme> dieFilme = new ArrayList<>();
        dieFilme.add(nemo);
        dieFilme.add(peanuts);
        dieFilme.add(terrax);

        for (Filme filme : dieFilme) {
            System.out.println(filme);
        }
    }
}
