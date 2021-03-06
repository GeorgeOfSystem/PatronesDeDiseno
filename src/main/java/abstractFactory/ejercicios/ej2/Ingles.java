package abstractFactory.ejercicios.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ingles implements IInscripcion{

    List<Estudiante> estudiantesCursando = new ArrayList<Estudiante>();

    @Override
    public void inscribirse(Estudiante estudiante) {
        System.out.println("Inscribiendo a estudiante: "+ estudiante.getNombre()+", "+estudiante.getApellido() +" en Ingles");
        estudiantesCursando.add(estudiante);
    }
}
