package Practica4;

public class Encargado implements IHandler {
    private IHandler next;
    private  int prestamo;

    public Encargado(int prestamo) {
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
        if (amount == prestamo ){
            System.out.println("Proceso Atendio por : el Encargado");
        } else {
            System.out.println("Por el momento no hay quien maneje su peticion");
        }

    }
}
