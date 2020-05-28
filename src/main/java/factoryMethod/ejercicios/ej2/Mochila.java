package factoryMethod.ejercicios.ej2;

public class Mochila {
    private int numeroDeBolsillos;
    private int size;

    public Mochila(int numeroDeBolsillos, int size) {
        this.numeroDeBolsillos = numeroDeBolsillos;
        this.size = size;
    }

    public int getNumeroDeBolsillos() {
        return numeroDeBolsillos;
    }

    public void setNumeroDeBolsillos(int numeroDeBolsillos) {
        this.numeroDeBolsillos = numeroDeBolsillos;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
