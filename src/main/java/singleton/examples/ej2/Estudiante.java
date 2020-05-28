package singleton.examples.ej2;

public class Estudiante {
    private String nombre;
    private int deuda;

    public Estudiante(String nombre, int deuda) {
        this.nombre = nombre;
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagar(){
        Ventanilla.getInstance().pagar(deuda,nombre);
    };
}
