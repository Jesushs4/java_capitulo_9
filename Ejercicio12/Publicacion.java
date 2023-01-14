public class Publicacion {
    private String isbn;
    private String titulo;
    private int year;

    public Publicacion(String i, String t, int y) {
        this.isbn = i;
        this.titulo = t;
        this.year = y;
    }

    @Override
    public String toString() {
        return "ISBN: "+isbn+", título: "+titulo+", año de publicación: "+year;
    }
}