public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void come(int p) {
        this.peso += p-1;
    }

    public void come(Ameba a) {
        come(a.peso);
        a.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+this.peso+" microgramos";
    }
    
}
