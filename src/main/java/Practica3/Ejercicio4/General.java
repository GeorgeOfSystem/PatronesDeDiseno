package Practica3.Ejercicio4;

public class General implements IHandler{
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

        if (order.equals("Entrevistas") ){
            System.out.println("Orden Atendida por : General");
        } else {
            System.out.println("Por el momento no hay quien maneje su orden");
        }

    }
}
