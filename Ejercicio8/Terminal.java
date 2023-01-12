public class Terminal {
    
    private String telefono;
    private int tiempoLlamada;

    public Terminal(String telefono) {
        this.telefono = telefono;
        this.tiempoLlamada = 0;
    }

    public String getTelefono(){
        return telefono;
    }

    public int getTiempoLlamada(){
        return tiempoLlamada;   
    }

    public void setTiempoLlamada(int n){
        this.tiempoLlamada = n;
    }

    @Override
    public String toString(){
        return "Nº "+this.telefono+" - "+this.tiempoLlamada+" de conversación";
    }

    public void llama(Terminal t, int llamada){
        this.tiempoLlamada += llamada;
        t.tiempoLlamada += llamada;

    }
}