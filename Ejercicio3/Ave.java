public abstract class Ave extends Animal {
    
    public Ave() {
        super();
    }

    public Ave(String s) {
        super(s);
    }

    public void vuela() {
        System.out.print("Estoy volando");
    }

    public void picotea() {
        System.out.print("Estoy picoteando");
    }
}
