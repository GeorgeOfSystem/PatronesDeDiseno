package TemplateMethod;

import java.util.Date;

public abstract class Persona {
    private int edad;
    private String nombre;
    private String date;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.date = new Date().toString();
    }

    abstract  void getEdad();
    abstract  void method2();

    public void showData(){
        System.out.println("La Persona tiene los siguinetes datos;");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Hora: " + date);
    }

    //  no se sobre escribe en clases hijas
    public final void getTimeNombre(){
        System.out.println("Son las " + date + ", Señor " + nombre );
    }
}
