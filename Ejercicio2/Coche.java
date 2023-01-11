public class Coche extends Vehiculo {
    

    private int marchas;
    Coche() {
        super();
        this.marchas = 4;
    }

    Coche(int marchas){
        super();
        this.marchas = marchas;
    }

    public int getMarchas() {
        return this.marchas;
    }

    public void quemaRueda(){
        System.out.print("Estoy quemando rueda");
    }

    @Override
    public void recorre(int kms){
        super.recorre(kms);
        System.out.println("Conduciendo durante "+kms+" kms");
    }
}
