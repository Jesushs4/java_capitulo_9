import java.util.Scanner;

public class PruebaGato {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Gato[] gato = new Gato[4];

        System.out.println("Introduzca los datos de los gatos");

        for (int i=0; i<4; i++) {
            gato[i] = new Gato();
            System.out.print("Nombre: ");
            gato[i].setNombre(sc.nextLine());
            System.out.print("Color: ");
            gato[i].setColor(sc.nextLine());
            System.out.println("Raza: ");
            gato[i].setRaza(sc.nextLine());
        }

        for (int i=0; i<4; i++) {
            System.out.println("Gato "+(i+1));
            System.out.print("Nombre: "+gato[i].getNombre());
            System.out.print("Color "+gato[i].getColor());
            System.out.println("Raza: "+gato[i].getRaza());
        }

    }
}
