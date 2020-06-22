package Practica5.Adapter;

public class AdapterRefrigerador implements IElectrico {

    // caracteristica
    private Refrigerador adaptee;

    public AdapterRefrigerador(Refrigerador adaptee){
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
