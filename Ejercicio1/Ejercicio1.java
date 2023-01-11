public class Ejercicio1 {
    public static void main (String args[]) {
        Caballo a = new Caballo("Marco", "marrón", "Morgan", 10, 60);
        Caballo b = new Caballo("Pepito", "blanco", "andaluz", 14, 70);

        System.out.println(a);
        System.out.println(b);

        a.relincha();
        System.out.println();
        b.come();


    }
    
}
