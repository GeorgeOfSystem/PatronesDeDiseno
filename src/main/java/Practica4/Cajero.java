package Practica4;

public class Cajero implements IHandler {

    private IHandler next;
    private int prestamo;

    public Cajero(int prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount, int prestamo) {
        //  condicion para poder hacerme responsable de esa informacion
        if ( 0 <= amount && amount < prestamo*0.25){
            System.out.println("Proceso Atendio por : el Cajero");
        } else {
            this.next.criteriaHandler(amount,prestamo);
        }

    }
}
