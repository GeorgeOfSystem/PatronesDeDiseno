package Practica5.Adapter;

import java.util.Random;

public class Celulares implements IElectrico {

    @Override
    public void presio(int presio) {
        System.out.println("El precio es: " + presio);
    }

    @Override
    public void tiempoDeVida(int tiempo) {
        System.out.println("El tiempo de vida: " + tiempo);
    }
}
