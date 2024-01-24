package G_Sequenzdiagramm;

public class Klasse2 {
    Klasse1 object1;

    public Klasse2(Klasse1 k1){
        object1 = k1;
    }

    public String op2() {

        String a3 = object1.op3();
        System.out.println("klasse 2 hat a3=" + a3);

        return "Antwort 2";
    }

}
