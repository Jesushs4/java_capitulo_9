public abstract class Mamifero extends Animal{
    
    public Mamifero() {
        super();
    }

    public Mamifero(String s) {
        super(s);
    }

    public void reproduce() {
        System.out.print("Me reproduzco");
    }

    public void corre() {
        System.out.print("Estoy corriendo");
    }
}
