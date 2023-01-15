public class FichaDomino {
    private int num1;
    private int num2;

    public FichaDomino(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String voltea() {
        int auxnum1 = this.num1;
        this.num1 = this.num2;
        this.num2 = auxnum1;
        return toString();
    }

    public boolean encaja(FichaDomino fd) {
        if (this.num1 == fd.num1 || this.num2 == fd.num2 || this.num1 == fd.num2 || this.num2 == fd.num1) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "["+(num1==0?" ":num1)+"]["+(num2==0?" ":num2)+"]";
    }
    
}
