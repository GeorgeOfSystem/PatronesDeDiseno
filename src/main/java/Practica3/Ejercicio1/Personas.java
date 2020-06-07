package Practica3.Ejercicio1;

public class Personas {
    private String name;
    private int ci;
    private int edad;

    public Personas(String name, int ci, int edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

}
