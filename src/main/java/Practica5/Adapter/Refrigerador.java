package Practica5.Adapter;

import java.util.Random;

public class Refrigerador {
    private int costo;
    int tiempoDeGarantia;

    public void costo(int cantidad) {
        System.out.println("El precio es: " + cantidad);
    }

    public void tiempoDeGarantia(int tiempo) {
        System.out.println("El tiempo de vida: " + tiempo);
    }
}
