package ChainOfResponsability;

public class CreditoSucursal implements  IHandler {

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
    public void criteriaHandler(int amount) {
        //  condicion para poder hacerme responsable de esa informacion
        if (amount >= 10 && amount < 20 && Caja.getInstance().Prestamo(amount)){
            System.out.println("Su monto es de: "+ amount + "K");
            System.out.println("Proceso Atendio por : El Agente de Credito Sucursal");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
