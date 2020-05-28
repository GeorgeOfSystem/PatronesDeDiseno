package singleton.examples.ej2;

import singleton.examples.ej1.Persona;
import singleton.examples.ej1.Robot;

public class Cliente {
    public static void main(String[] args) {


        Cajero cajero = new Cajero(46185);
        cajero.registrarEnVentanilla();

        Estudiante juan = new Estudiante("juan",500);
        juan.pagar();
        Ventanilla.getInstance().getMonto();

        Estudiante carlos = new Estudiante("carlos",500);
        carlos.pagar();
        Ventanilla.getInstance().getMonto();

        Estudiante maria = new Estudiante("maria",500);
        maria.pagar();
        Ventanilla.getInstance().getMonto();

        Estudiante jorge = new Estudiante("carlos",500);
        jorge.pagar();
        Ventanilla.getInstance().getMonto();

        Estudiante nicole = new Estudiante("maria",500);
        nicole.pagar();
        Ventanilla.getInstance().getMonto();

    }
}
