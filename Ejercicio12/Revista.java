public class Revista extends Publicacion {
    private int numero;

    public Revista(String i, String t, int y, int numero) {
        super(i,t,y);
        this.numero = numero;
    }
}
