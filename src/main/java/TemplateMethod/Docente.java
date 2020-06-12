package TemplateMethod;

public class Docente extends Persona {

    public Docente(int edad, String nombre) {
        super(edad,nombre);
    }

    @Override
    void getEdad() {
    }

    @Override
    void method2() {
        System.out.println("Llamndo lista de presencia");
    }

}
