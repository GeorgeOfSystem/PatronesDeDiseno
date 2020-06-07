package Practica3.Ejercicio2;

public class Organizador implements IHandler {
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

        AtencionAlCliente atencionAlCliente = new AtencionAlCliente();
        Notariado notario  = new Notariado();
        Cajero cajero = new Cajero();
        Carnet carnet = new Carnet();


        // orden de la cadena responsabilidad
        this.setNext(atencionAlCliente);
        atencionAlCliente.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(carnet);

        this.next.criteriaHandler(requisito);
    }
}
