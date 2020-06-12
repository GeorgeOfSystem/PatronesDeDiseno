package TemplateMethod;

public class Client {
    public static void main (String[] argsss){
        Estudiante estudiante = new Estudiante(20,"Nicole",46185);

        estudiante.showData();
        estudiante.getTimeNombre();
        estudiante.getEdad();
        estudiante.method2();

        System.out.println();

        Docente docente = new Docente(35,"Eynar");

        docente.showData();
        docente.getTimeNombre();
        docente.getEdad();
        docente.method2();

        System.out.println();

        Director director = new Director(60,"Oscar");
        director.showData();
        director.getTimeNombre();
        director.getEdad();
        director.method2();

    }
}
