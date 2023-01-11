public abstract class Animal {
    private String sexo;

    public Animal() {
        this.sexo = "Macho";
    }
    public Animal(String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void come(String c) {
        System.out.print("Estoy comiendo "+c);
    }

    public void bebe(){
        System.out.print("Estoy bebiendo");
    }
}