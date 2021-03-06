package Practica4;

public class Supervisor implements IHandler {

    private IHandler next;
    private  int prestamo;

    public Supervisor(int prestamo) {
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
        if (amount >= prestamo*0.5 && amount < prestamo){
            System.out.println("Proceso Atendio por : el supervisor");
            System.out.println("¿Le gustaria ralizar un nuevo prestamos?");
        } else {
            this.next.criteriaHandler(amount,prestamo);
        }

    }
}
