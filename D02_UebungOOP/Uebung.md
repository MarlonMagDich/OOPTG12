# Übung OOP

Es sollen Filme verwaltet werden. Alle Filme haben einen Titel und eine Dauer.

Dokumentarfilme haben eine extra Beschreibung. Bei Trickfilmen wird ein Mindestalter angegeben.

Lösen Sie diese Aufgabe mithilfe der Vererbung.

1. Erstellen Sie die notwendigen Klassen in Java mit Attributen. (10min)
````java
    public class Filme {
        private String titel;
        private int dauer;
    }
    public class Trickfilme extends Filme{
        private int mindestalter;
    }
    public class Dokumentarfilme extends Filme{
        private String beschreibung;
    }
````

2. Ein Film darf nur erstellt werden wenn der Titel bekannt ist -> Konstruktor
````java
    public Filme(String pTitel) {
        titel = pTitel;
    }
````

3. Titel und Dauer sollen gekapselt, lesbar und änderbar sein. -> Getter und Setter einarbeiten

4. Ein Titel muss mindesten 2 Zeichen lang sein. Falls der Titel kürzer ist, soll eine FilmTitelZuKurzException geworfen werden.
5. Ergänzen die notwendigen Konstruktoren aufgrund der Vererbung der Klasse Filme
6. Trickfilme sollen auch direkt mit dem Mindestalter erzeugt werden können.
7. Alle Filmdaten sollen in einer Schleife ausgegeben werden
