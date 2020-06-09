package Strategy;

public class Client {
    public static void main(String []abx){

        Colegio colegio = new Colegio();
        colegio.addEstudiante(new Estudiante("nicole",74));
        colegio.addEstudiante(new Estudiante("jorge",55));
        colegio.addEstudiante(new Estudiante("Daniela",73));
        colegio.addEstudiante(new Estudiante("Lopez",71));
        colegio.addEstudiante(new Estudiante("Arcienega",88));
        colegio.addEstudiante(new Estudiante("rojas",72));
        colegio.addEstudiante(new Estudiante("Angles",100));
        colegio.addEstudiante(new Estudiante("ignacio",60));

        colegio.setStrategy(new JavaSort());
        colegio.execute();
        System.out.println();

        colegio.setStrategy(new BubbleSort());
        colegio.execute();
        System.out.println();

        colegio.setStrategy(new InsertionSort());
        colegio.execute();
        System.out.println();
    }

}
