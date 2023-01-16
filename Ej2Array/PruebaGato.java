import java.util.Scanner;

public class PruebaGato {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Gato[] gato = new Gato[4];

        System.out.println("Introduzca los datos de los gatos");

            gato[0] = new Gato("Xin","Verde","Atomico");
            gato[1] = new Gato("Chad","Negro","Siames");
            gato[2] = new Gato("Denis","Marrón","Rumano");
            gato[3] = new Gato("Garfield","Naranja","Egipcio");

        for (int i=0; i<4; i++) {
            System.out.println("Gato "+(i+1));
            System.out.print("Nombre: "+gato[i].getNombre()+" ");
            System.out.print("Color: "+gato[i].getColor()+" ");
            System.out.println("Raza: "+gato[i].getRaza()+" ");
        }

    }
}
