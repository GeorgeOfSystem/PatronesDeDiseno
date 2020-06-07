package Practica3.Ejercicio4;

public class Cabo implements IHandler {

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

        if (order.equals("Limpiezas")){
            System.out.println("Orden Atendida por : Cabo");
        } else {
            this.next.answerOrder(order);
        }

    }
}
