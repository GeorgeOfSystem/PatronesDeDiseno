package Adaptor;

public class AutomovilElectrico {
    int carga;


    public int estadoCarga() {
        return this.carga;
    }


    public void cargar() {
        this.carga = (int)(Math.random()*(100+1));
        System.out.println("Estado de la carga es : " + estadoCarga());
    }
}
