package B00_Konstruktor;


public class Schueler {
    //Objektvariable
    String name;
    String vorname;
    String email;

    // Konstruktor für die Klasse Schueler
    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }
    
    public Schueler(String name, String vorname, String email) {
        this(name,vorname); //Aufruf des Konstruktors mit 2 String Parametern
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Vorname=" + vorname + ", Email=" + email;
    }
    
    
}

