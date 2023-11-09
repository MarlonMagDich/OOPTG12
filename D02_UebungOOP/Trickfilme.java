package D02_UebungOOP;

public class Trickfilme extends Filme{
    private int mindestalter;

    public Trickfilme(String pTitel) {
        super(pTitel);
        mindestalter=0;
    }

    public Trickfilme(String pTitel, int mindestalter) {
        super(pTitel);
        this.mindestalter = mindestalter;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mindesalter: " + mindestalter;
    }

    public int getMindestalter() {
        return mindestalter;
    }

    public void setMindestalter(int mindestalter) {
        this.mindestalter = mindestalter;
    }
    
    
}
