package C00_Vererbung;

// extends Person für eine Verberung
public class Schueler extends Person{

    private String email;

    public Schueler(String name, String vorname) {
        super(name, vorname);
        email=null;
    }

    public Schueler(String name, String vorname, String email) {
        super(name, vorname);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Schueler email=" + email + super.toString();
    }

        
    
}

