package G_Sequenzdiagramm;

public class Klasse1 {
    Klasse2 object2;

    public Klasse1(Klasse2 k2){
        object2 = new Klasse2(this);
    }

    public void op1(){
        String a2 =object2.op2();
        System.out.println(a2);
    }

    public String op3() {
        return "antwort von klasse 1 an klasse 2";
    }
    
}
