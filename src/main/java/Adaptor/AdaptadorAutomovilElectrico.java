package Adaptor;

public class AdaptadorAutomovilElectrico implements IEmpresaAutomoviles {
    // caracteristica
    private AutomovilElectrico adaptee;

    public AdaptadorAutomovilElectrico(AutomovilElectrico adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public int estadoCompustible() {
       return this.adaptee.estadoCarga();
    }

    @Override
    public void llenarCombustible() {
        this.adaptee.cargar();
    }
}
