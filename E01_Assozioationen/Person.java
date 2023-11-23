package E01_Assozioationen;

public class Person {
    //Objektvariable
    private String name;
    private Parkplatz derParkplatz;

    //Konstruktor
    public Person(String name, Parkplatz p) {
        this.name = name;
        this.derParkplatz = p;
    }

    @Override
    public String toString() {
        return "name=" + name + ", derParkplatz=" + derParkplatz;
    }

    public String getParkplatzNr() {
        return derParkplatz.getNummer();
    }


    
    




}