public class Tiempo implements Cloneable{
    private int segundos;

    
    public int getHoras() {
        return this.segundos/3600;
    }

    public int getMinutos() {
        return (this.segundos%3600)/60;
    }
    public int getSegundosVerdad() {
        return (this.segundos%60);
    }

    public int getSegundos() {
        return this.segundos;
    }
    Tiempo(){
        this.segundos = 0;
    }

    Tiempo(int h, int m, int s){
        this.segundos = (h*3600) + (m*60) + s;
    }

    Tiempo(int s) {
        this.segundos = s;
    }

    Tiempo(Tiempo t) {
        this(t.getHoras(), t.getMinutos(), t.getSegundos());
    }

    @Override
    public Tiempo clone(){
        return new Tiempo(this.getHoras(), this.getMinutos(), this.getSegundos());
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.segundos + t.getSegundos());
    }

    public Tiempo resta (Tiempo t) {    
        return new Tiempo(this.segundos - t.getSegundos());
    }

    @Override
    public String toString() {
        if (this.segundos < 0) { 
        return "-("+(-this.getHoras()+"h "+-this.getMinutos()+"m "+-this.getSegundosVerdad()+"s) ");
        }
        else { 
            return (this.getHoras()+"h "+this.getMinutos()+"m "+this.getSegundosVerdad()+"s");
        }
    }
}