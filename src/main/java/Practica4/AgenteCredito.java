package Practica4;

public class AgenteCredito implements IHandler {

    private IHandler next;
    private int prestamo;

    public AgenteCredito(int prestamo) {
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
        if (amount >= prestamo*0.25 && amount < prestamo*0.5 ){
            System.out.println("Proceso Atendio por : El Agente de Credito");
            System.out.println("¿Le gustaria ralizar un refinanciamiento de su prestamos?");
        } else {
            this.next.criteriaHandler(amount,prestamo);
        }

    }
}
