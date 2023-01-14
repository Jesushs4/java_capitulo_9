public class Libro extends Publicacion implements Prestable{
    private boolean prestado = false;

    public Libro(String i, String t, int y) {
        super(i,t,y);
    }

    @Override
    public void presta() {
        if (prestado) {
            System.out.println("Este libro ya está prestado");
        }
        else {
            prestado = true;
        }
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        if (prestado) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+(this.prestado?" (prestado)":" (no prestado)");
    }
}
