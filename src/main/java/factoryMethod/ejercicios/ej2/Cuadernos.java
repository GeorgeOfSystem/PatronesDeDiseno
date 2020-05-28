package factoryMethod.ejercicios.ej2;

public class Cuadernos {
    private String tipo;
    private int cantidadHojas;

    public Cuadernos(String tipo, int cantidadHojas) {
        this.tipo = tipo;
        this.cantidadHojas = cantidadHojas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
}
