package Practica4;

public class Persona {
    private String nombre;
    private  int montoPrestamo;

    public Persona(String nombre, int montoPrestamo) {
        this.nombre = nombre;
        this.montoPrestamo = montoPrestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void depositar(int monto){
        Organizador organizador = new Organizador();
        System.out.println("+++++++++++++ "+nombre+" +++++++++++++");
        organizador.criteriaHandler(monto,montoPrestamo);
    }
}
