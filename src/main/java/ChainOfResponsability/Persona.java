package ChainOfResponsability;

public class Persona {
    private String nombre;
    private int ci;
    private  int montoPrestamo;

    public Persona(String nombre, int ci, int montoPrestamo) {
        this.nombre = nombre;
        this.ci = ci;
        this.montoPrestamo = montoPrestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void consultarPrestamo(){
        Organizador organizador = new Organizador();
        System.out.println("+++++++++++++ "+nombre+" +++++++++++++");
        organizador.criteriaHandler(montoPrestamo);
    }
}
