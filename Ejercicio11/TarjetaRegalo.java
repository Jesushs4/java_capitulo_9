public class TarjetaRegalo {
    private double saldo;
    private int numero;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero = (int)((Math.random()*90000)+10000);
        }

    public void gasta(double gasto) {
        if (gasto <= saldo) {
            this.saldo -= gasto;
        }
        else {
            System.out.println("No tiene suficiente saldo para gastar "+ gasto);
        }
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double nuevoSaldo = this.saldo + t.saldo;
        this.saldo = 0;
        t.saldo = 0;
        return new TarjetaRegalo(nuevoSaldo);
    }

    @Override
    public String toString() {
        return "Tarjeta nº "+this.numero+" - Saldo "+this.saldo;
    }

}
