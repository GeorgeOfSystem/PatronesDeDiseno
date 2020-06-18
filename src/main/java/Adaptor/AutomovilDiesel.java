package Adaptor;

public class AutomovilDiesel implements IEmpresaAutomoviles {
    int combustible;

    @Override
    public int estadoCompustible() {
        return this.combustible;
    }

    @Override
    public void llenarCombustible() {
        this.combustible = (int)(Math.random()*(100+1));
        System.out.println("Estado del combustible es : " + estadoCompustible());
    }
}
