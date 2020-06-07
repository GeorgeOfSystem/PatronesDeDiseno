package Practica3.Ejercicio2;

public class Cajero implements  IHandler {

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

        if (!requisito.getPagoBanco()){
            System.out.println("Proceso Atendio por : Cajera del Banco");
            System.out.println("Deposito realizado");
            requisito.setPagoBanco(true);
        }
        this.next.criteriaHandler(requisito);
    }
}
