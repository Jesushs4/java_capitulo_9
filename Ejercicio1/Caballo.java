public class Caballo {
    
    private String nombre, color, raza;
    private int edad, velocidad;

    Caballo (String n, String c, String r, int e, int v) {
        this.nombre = n;
        this.color = c;
        this.raza = r;
        this.edad = e;
        this.velocidad = v;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getColor() {
        return this.color;
    }

    public String getRaza() {
        return this.raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void relincha() {
        System.out.print("Hiieeeeeeeeeeee");
    }

    public void come() {
        System.out.print("Ñam ñam ñam");
    }

    @Override
    public String toString() {
        return "El nombre del caballo es "+nombre+", su color es "+color+", pertenece a la raza "+raza+", tiene "+edad+" años y corre a "+velocidad+"m/s";
    }


}
