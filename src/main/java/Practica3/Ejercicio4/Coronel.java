package Practica3.Ejercicio4;

public class Coronel implements  IHandler {

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
    public void answerOrder(String order) {
        //  condicion para poder hacerme responsable de esa informacion

        if (order.equals("Desbloqueos") || order.equals("Manifestaciones")){
            System.out.println("Orden Atendida por : Coronel");
        } else {
            this.next.answerOrder(order);
        }

    }
}
