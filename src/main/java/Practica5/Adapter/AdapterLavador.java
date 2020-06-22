package Practica5.Adapter;

public class AdapterLavador implements IElectrico {
    
    // caracteristica
    private Lavador adaptee;

    public AdapterLavador(Lavador adaptee){
        this.adaptee= adaptee;
    }


    @Override
    public void presio(int presio) {
        this.adaptee.costo(presio);
    }

    @Override
    public void tiempoDeVida(int tiempo) {
        this.adaptee.tiempoDeGarantia(tiempo);
    }
}
