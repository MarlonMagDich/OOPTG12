package E01_Assozioationen;

public class Parkplatz {
    //Klassenvariable
    private static int anzahlGeloeschterParkplaetze = 0;
    private static int anzahlErzeugterParkplaetze = 0;
    //Objektvariable
    private int id;
    private String nummer;


    public Parkplatz(String nr) {
        this.nummer = nr;

        anzahlErzeugterParkplaetze++;
        id = anzahlErzeugterParkplaetze;

        
    }


    @Override
    protected void finalize() throws Throwable {
        anzahlGeloeschterParkplaetze++;
        System.out.println("Parkplatz gelöscht! WOWEY");
        
    }


    public static int getAnzahlParkplaetze() {
        return anzahlErzeugterParkplaetze-anzahlGeloeschterParkplaetze;
    }





    public int getId() {
        return id;
    }





    public String getNummer() {
        return nummer;
    }


    @Override
    public String toString() {
        return "Parkplatz [id=" + id + ", nummer=" + nummer + "]";
    }

    

    
}
