package Practica3.Ejercicio2;

public class Carnet implements IHandler {

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
        //  condicion para poder hacerme responsable de esa informacion

        if (!requisito.getCertificadoNacimiento().isEmpty() && requisito.getPagoBanco() && requisito.getFicha()){
            System.out.println("Procesando la creación de su Carnet, por favor espere");
        }
    }
}
