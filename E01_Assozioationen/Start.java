package E01_Assozioationen;

public class Start {
    public static void main(String[] args) {
        Parkplatz p1 = new Parkplatz("A1");
        Parkplatz p2 = new Parkplatz("A2");
        Parkplatz p3 = new Parkplatz("A3");
        p3 = null;

        System.gc();
        //Warten

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Anzahl Parkplaetze: " + Parkplatz.getAnzahlParkplaetze());
        Person max = new Person("Meier", p1);
        System.out.println(max);
        System.out.println(max.getParkplatzNr());



    }
}
