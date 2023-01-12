public class Pizza {

    private String tipo, tamano, estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String ti, String ta){
        this.tipo = ti;
        this.tamano = ta;
        this.estado = "pedida";
        totalPedidas++;
    }

    public static int getTotalPedidas(){
        return totalPedidas;
    }
    
    public static int getTotalServidas(){
        return totalServidas;
    }

    public void sirve(){
        if (estado.equals("servida")) {
            System.out.println("esta pizza ya se ha servido");
        }
        else {
            this.estado = "servida";
            totalServidas++;
        }
    }

    @Override
    public String toString(){
        return "pizza "+this.tipo+" "+this.tamano+", "+this.estado;
    }
    
}
