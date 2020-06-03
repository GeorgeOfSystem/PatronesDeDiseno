package ChainOfResponsability;

public class CreditoNac implements IHandler{
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
        if (amount >= 50 && Caja.getInstance().Prestamo(amount)){
            System.out.println("Su monto es de: "+ amount + "K");
            System.out.println("Proceso Atendio por : el Agente de Credito Nacional");
        } else {
            System.out.println("Por el momento no hay quien maneje su peticion");
        }

    }
}
