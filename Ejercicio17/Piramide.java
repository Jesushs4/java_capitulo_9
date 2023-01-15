public class Piramide {
    private static int piramidesCreadas;
    private int altura;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String piramide="";

        for (int i=0; i<this.altura; i++) {
            for (int j=0; j<this.altura-1-i; j++) {
                piramide+=" ";
            }
            for (int j=0; j<(i*2)+1; j++) {
                piramide+="*";
            }
            piramide+="\n";
        }
        return piramide;

    }


}
