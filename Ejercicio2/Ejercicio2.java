import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String args[]) {
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");

    Scanner sc = new Scanner(System.in);
    Bicicleta b = new Bicicleta(8);
    Coche c = new Coche(7);
    int opcion;
    int kms;
    do {
    opcion = sc.nextInt();
    
    switch (opcion) {
        case 1:
        System.out.println("¿Cuantos kms?");
        kms = sc.nextInt();
        b.recorre(kms);
        break;
        case 2:
        b.caballito();
        System.out.println();
        break;
        case 3:
        System.out.println("¿Cuantos kms?");
        kms = sc.nextInt();
        c.recorre(kms);
        break;
        case 4:
        c.quemaRueda();
        System.out.println();
        break;
        case 5:
        System.out.println("Ha recorrido "+b.getKilometrosRecorridos()+" kms");
        break;
        case 6:
        System.out.println("Ha recorrido "+c.getKilometrosRecorridos()+" kms");
        break;
        case 7:
        System.out.println("En total se han recorrido "+Vehiculo.getKilometrosTotales()+" kms");
        break;
        default:
        System.out.println("Opción incorrecta");
        break;
    }
    } while (opcion!=8);
}
}
