public class Movil extends Terminal {
    private String tarifa;
    private double tarifaTotal;

    public Movil(String telefono, String tarifa) {
        super(telefono);
        this.tarifa = tarifa;
        this.tarifaTotal = 0;
    }

    @Override
    public void llama(Terminal t, int llamada) {
        super.llama(t, llamada);
        double minutos = (double) llamada / 60;

        switch (this.tarifa) {
            case "rata":
              this.tarifaTotal += minutos * 0.06;
              break;
            case "mono":
              this.tarifaTotal += minutos * 0.12;
              break;
            case "bisonte":
              this.tarifaTotal += minutos * 0.30;
              break;
            default:
          }
    }

    @Override
    public String toString() {
    return "Nº " + this.getTelefono()+ " - " + this.getTiempoLlamada()+ "s de conversación - tarificados "+ (this.tarifaTotal) + " euros";
  }

}
