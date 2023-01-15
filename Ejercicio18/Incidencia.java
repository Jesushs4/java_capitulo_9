public class Incidencia {
    private int puesto;
    private static int pendientes = 0;
    private static int contador = 0;
    private int incidencia;
    private boolean resuelto = false;
    private String problema = "";
    private String resolucion = "";

    public Incidencia(int pu, String pr) {
        this.puesto = pu;
        this.problema += pr;
        contador++;
        this.incidencia = contador;
        pendientes++;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public void resuelve(String re) {
        this.resolucion += re;
        this.resuelto = true;
        pendientes--;
    }

    @Override
    public String toString() {
        return "Incidencia "+this.incidencia+" - Puesto: "+this.puesto+" - "+this.problema+" - "+((!resuelto)?"Pendiente":"Resuelta")+((!resuelto)?"":" - "+this.resolucion);
    }


}
