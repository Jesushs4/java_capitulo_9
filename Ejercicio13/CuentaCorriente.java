public class CuentaCorriente {
    private double saldo;
    private String num;

    public CuentaCorriente() {
        this.num = "";
        this.saldo = 0;
        for (int i=0; i<10; i++) {
        this.num +=(int)((Math.random())*10);
        }
    }

    public CuentaCorriente(int s) {
        this();
        this.saldo = s;
    }

    public int getSaldo(int s) {
        return s;
    }

    public void ingreso(int ingreso) {
        this.saldo += ingreso;
    }

    public void cargo(int cargo) {
        this.saldo -= cargo;
    }

    public void transferencia(CuentaCorriente cc, int transferencia) {
        this.cargo(transferencia);
        cc.ingreso(transferencia);
    }

    @Override
    public String toString() {
        return "Número de cuenta: "+num+" Saldo: "+saldo+" €";
    }
}