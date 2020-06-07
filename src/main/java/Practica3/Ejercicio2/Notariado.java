package Practica3.Ejercicio2;

import java.util.Scanner;

public class Notariado implements  IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Requisitos requisito) {
        //  condicion para poder hacerme responsable de esa informacion
        if (requisito.getCertificadoNacimiento().isEmpty()){
            System.out.println("Proceso Atendio por : Notariado");
            System.out.println("Ingrese su fecha de nacicimiento");
            Scanner sc = new Scanner(System.in);
            requisito.setCertificadoNacimiento(sc.nextLine());
        }
        this.next.criteriaHandler(requisito);
    }
}
