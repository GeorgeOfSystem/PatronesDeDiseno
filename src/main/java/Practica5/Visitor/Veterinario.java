package Practica5.Visitor;

import java.util.Date;

public class Veterinario implements IVisitor {
    private double plata;

    public Veterinario(int plata) {
        this.plata = plata;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public double curar(Perro perro,String msg) {
       System.out.println("Visitando con Veterinario al Perro ");
        System.out.println(msg);
       System.out.println("Hora de la curación: "+ new Date().toString());
       return 0.0;
    }

    @Override
    public double curar(Gato gato,String msg) {
        System.out.println("Visitando con Veterinario al Gato ");
        System.out.println(msg);
        System.out.println("Hora de la curación: "+ new Date().toString());
        return 0.0;
    }

    @Override
    public double curar(Caballo caballo, String msg) {
        System.out.println("Visitando con Veterinario al Caballo ");
        System.out.println(msg);
        System.out.println("Hora de la curación: "+ new Date().toString());
        return 0.0;
    }
}
