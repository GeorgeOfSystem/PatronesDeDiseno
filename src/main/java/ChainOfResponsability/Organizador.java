package ChainOfResponsability;

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

    //Agente Credito Local  ---> 0 - 10k
    //Agente Credito Sucursal  -->  10k - 20k
    //Agente Credito Dept  ---> 20k - 50 k
    //Agente Credito Nac --->   sin limite

    @Override
    public void criteriaHandler(int amount) {

        CreditoLocal creditoLocal = new CreditoLocal(); // 0 - 10k
        CreditoSucursal creditoSucursal = new CreditoSucursal(); //  10k - 20k
        CreditoDept creditoDept = new CreditoDept(); //   20k - 50 k
        CreditoNac creditoNac = new CreditoNac(); // sin limite

        // orden de la cadena responsabilidad
        this.setNext(creditoLocal);
        creditoLocal.setNext(creditoSucursal);
        creditoSucursal.setNext(creditoDept);
        creditoDept.setNext(creditoNac);

        this.next.criteriaHandler(amount);
    }
}
