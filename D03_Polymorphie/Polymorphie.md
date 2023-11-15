# Polymorphie in der OOP

Es gibt zwei Arten der Polymorphie in der OOP.
1. Die Statische Polymorphie
2. Die Dynamische Polymorphie

## Statische Polymorphie
Mit statischer Polymorphie ist das Überladen von Methoden innerhalb einer klasse gemeint. D.h. eine Methode kommt in einer Klasse mehrfach vor und unterscheidet sich nur durch die Übergabeparameter.

### Beispiel:
````java
class Schueler{

    //Objektattribute
    private String name;
    private String vorname;

    //Konstruktor(methode)
    public Schueler(){
        name="Mustermann";
        vorname="Max";
    }

    //Überladener Konstruktor
    public Schueler(String name){
        this.name=name;
        vorname="Max";
    }

}
````

### Beispiel 2:

````java
class Uhr{

    //..

    public void setUhrzeit(int stunden){
        //..
    }
    
    public void setUhrzeit(int stunden, int minuten){
        //..
    }

}
````

>Bei statischer Polymorphie ist direkt beim Aufruf der Methode erkennbar, welche der überladenen Methode ausgeführt werden muss.

````java
Schueler s1 = new Schueler("Meier"); //-> Überladener Konstruktor
Schueler s1 = new Schueler(); //-> Standard Konstruktor
//.....
dieUhr.setUhrzeit(13,15); //setUhrzeit mit Stunden und Minuten
dieUhr.setUhrzeit(13); //setUhrzeit mit Stunden
````

## Dynamische Polymorphie
Gibt es in einer Verebungshierarchie mindestens zwei Überschriebene Methoden, so ist diese Methode polymorph.


Beispiel:
````java
public class Mitarbeiter{

    public double berechneGehalt(){
        return anzahlStunden * Stundenlohn;
    }
}

public class Abteilungsleiter extends Mitarbeiter{


    @Overrider
    public double berechneGehalt(){
        return AnzahlStunden * Stundenlohn + Zulage;
    }
}
````

Folgendes gilt heir:
- die Methode `berechneGehalt()` in der Klasse Abteilungsleiter wurde Überschrieben. D.h. der gleiche Methodenname mit der gleichen Signatur (Rückgabewert, übergabeparameter) wird in einer erbenden Klasse mit neuem Code implementiert.
- es existiert bereits eine Implementierung in der Oberklasse

Daraufs folgt:
- Es existieren 2 Implemtierungen einer Methode in einer Vererbungshierarchie.
- Die Methode ist Polymorph. Welche Methode ausgeführt wird, entscheidet sich erst zur Laufzeit.

````java
public class Startklasse{

    public static void main(String[] args){
        Mitarbeiter m1 = new Mitarbeiter();
        Abteilungsleiter a1 = new Abteilungsleiter();

        double gehalt1 = m1.berechneGehalt();
        double gehalt2 = a1.berechneGehalt();
    }
}

````