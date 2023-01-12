import java.util.Scanner;
public class PruebaZona {

    public static void main(String args[]) {
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        boolean exit = false;
        int entradas;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("1. Numero de entradas\n2. Vender entradas\n3. Salir\n");
        int option = sc.nextInt();

        switch (option) {
            case 1:
            System.out.println("En la zona principal quedan "+principal.getEntradasPorVender());
            System.out.println("En la zona de compra-venta quedan "+compraventa.getEntradasPorVender());
            System.out.println("En la zona VIP quedan "+vip.getEntradasPorVender());

            break;
            case 2:
                System.out.print("1. Zona principal\n2. Zona de Compra-venta\n3. Zona VIP\n");
                int option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                    System.out.print("Introduzca el número de entradas que desea comprar: ");
                    entradas = sc.nextInt();
                    principal.vender(entradas);
                    break;

                    case 2:
                    System.out.print("Introduzca el número de entradas que desea comprar: ");
                    entradas = sc.nextInt();
                    compraventa.vender(entradas);
                    break;

                    case 3:
                    System.out.print("Introduzca el número de entradas que desea comprar: ");
                    entradas = sc.nextInt();
                    vip.vender(entradas);
                    break;
                    default:
                    System.out.print("Introduzca una zona válida");
                    break;
                }
            break;
            case 3:
            exit = true;
            break;
            default:
            System.out.println("Escoja una opción válida");
            break;
        }
    } while (!exit);

    }
    
}
