package TemplateMethod;

public class Estudiante extends Persona {
    private int codigo;
    public Estudiante(int edad, String nombre,int codigo) {
        super(edad,nombre);
        this.codigo = codigo;
    }

    @Override
    void getEdad() {

    }

    @Override
    void method2() {
        System.out.println("Asistiendo a clases on-line");
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("COD Inscripción: "+ codigo);
    }

}
