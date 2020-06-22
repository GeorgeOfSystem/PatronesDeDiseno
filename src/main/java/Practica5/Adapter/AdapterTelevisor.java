package Practica5.Adapter;

public class AdapterTelevisor implements IElectrico {
    // caracteristica
    private Television adaptee;

    public AdapterTelevisor(Television adaptee){
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
