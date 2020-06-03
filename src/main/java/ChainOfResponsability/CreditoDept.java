package ChainOfResponsability;

public class CreditoDept implements  IHandler {

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
        if (amount >= 20 && amount < 50 && Caja.getInstance().Prestamo(amount)){
            System.out.println("Su monto es de: "+ amount + "K");
            System.out.println("Proceso Atendio por : el Agente de Dredito Departamental");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
