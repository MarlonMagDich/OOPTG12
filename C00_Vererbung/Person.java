package C00_Vererbung;


public class Person{
    private String name;
    private String vorname;
    protected int id;
    
    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " name=" + name + ", vorname=" + vorname + ", id=" + id;
    }


    
}