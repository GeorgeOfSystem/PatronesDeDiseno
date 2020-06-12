package TemplateMethod;

public class Director extends  Persona{

    public Director(int edad, String nombre) {
        super(edad,nombre);
    }

    @Override
    void getEdad() {
    }

    @Override
    void method2() {
        System.out.println("Inscribiendo Docente");
    }
}
