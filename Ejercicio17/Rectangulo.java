public class Rectangulo {
    private static int rectangulosCreados;
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String rectangulo="";

        for (int i=0; i<this.altura; i++) {
            for (int j=0; j<this.base; j++) {
                rectangulo+="*";
            }
            rectangulo+="\n";
        }
        return rectangulo;

    }


}