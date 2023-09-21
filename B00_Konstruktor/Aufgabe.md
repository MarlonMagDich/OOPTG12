# Aufgabe zu Konstruktoren

1. Erstellen Sie eine Klasse `Schueler` mit den Attributen Name, Vorname und email.
```java
public class Schueler {
    //Objektvariable
    String name;
    String vorname;
    String email;
}
```



2. Ein Schuelerobjekt darf nur erstellt werden, wenn der Name und der Vorname bekannt ist. Ergänzen Sie die Klasse `Schueler`.
```java
    // Konstruktor für die Klasse Schueler
    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        email = null;
    }
```   

3. Ein Schueler soll auch mit einer Email-Adresse direkt erstellt werden können. Ergänzen Sie die Klasse `Schueler` um einen weietren Konstruktor und verketten sie diesen mit dem bereits vorhandnen Konstruktor.
```java
    public Schueler(String name, String vorname, String email) {
        this(name,vorname);
        this.email = email;
    }
```
    

4. Erzeugen Sie die Schuelerobjekte `Max Meier` mit der Emailadresse `mm@web.de` und `Julian Nagelsmann` ohne Emailadresse in einer ausführbaren Klasse `ErzeugeSchueler.java`.
```java
    public static void main(String[] args) {
        Schueler s1 = new Schueler("Maier", "Max", "mm@web.de");
        Schueler s2 = new Schueler("Nagelsmann", "Julian");
        System.out.println(s1.name);
    }
```   

5. Die Daten der Schueler sollen auf der Konsole ausgegeben werden. Überschreiben Sie die `toString()`-Methode aus der Klasse `Object`.
```java
//In Schueler
    @Override
    public String toString() {
        return "Name=" + name + ", Vorname=" + vorname + ", Email=" + email;
    }
//In ErzeugeSchueler
        System.out.println(s1.toString());
        System.out.println(s2.toString());
```    