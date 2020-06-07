package Practica3.Ejercicio4;

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
    public void answerOrder(String order) {

        Cabo cabo = new Cabo();
        Coronel coronel = new Coronel();
        Teniente teniente = new Teniente();
        General general = new General();

        // orden de la cadena responsabilidad
        this.setNext(cabo);
        cabo.setNext(coronel);
        coronel.setNext(teniente);
        teniente.setNext(general);

        this.next.answerOrder(order);
    }
}
