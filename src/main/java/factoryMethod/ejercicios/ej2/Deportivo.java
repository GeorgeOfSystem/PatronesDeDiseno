package factoryMethod.ejercicios.ej2;

public class Deportivo {
    private String talla;
    private String color;
    private int numeroDePrenda;

    public Deportivo(String talla, String color, int numeroDePrenda) {
        this.talla = talla;
        this.color = color;
        this.numeroDePrenda = numeroDePrenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePrenda() {
        return numeroDePrenda;
    }

    public void setNumeroDePrenda(int numeroDePrenda) {
        this.numeroDePrenda = numeroDePrenda;
    }
}
