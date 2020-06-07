package Practica3.Ejercicio2;

public class AtencionAlCliente implements IHandler{
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
    public void criteriaHandler(Requisitos requisito) {
        if (requisito.getCertificadoNacimiento().isEmpty() && !requisito.getPagoBanco() && !requisito.getFicha()){
            System.out.println("Atencion Al cliente : certificado de nacimiento, pago al banco y " +
                    "ficha son los requisitos que nesesita");
            System.out.println("Sacando ficha");
            requisito.setFicha(true);
        }
        this.next.criteriaHandler(requisito);
    }
}
