package Practica4;

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
    public void criteriaHandler(int amount,int prestamo) {

        Cajero creditoLocal = new Cajero(prestamo);
        AgenteCredito creditoSucursal = new AgenteCredito(prestamo);
        Supervisor creditoDept = new Supervisor(prestamo);
        Encargado creditoNac = new Encargado(prestamo);

        // orden de la cadena responsabilidad
        this.setNext(creditoLocal);
        creditoLocal.setNext(creditoSucursal);
        creditoSucursal.setNext(creditoDept);
        creditoDept.setNext(creditoNac);

        this.next.criteriaHandler(amount,prestamo);
    }
}
