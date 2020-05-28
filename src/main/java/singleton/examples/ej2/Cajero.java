package singleton.examples.ej2;

public class Cajero {
    private int CodCajero;

    public Cajero(int codCajero) {
        CodCajero = codCajero;
    }

    public int getCodCajero() {
        return CodCajero;
    }

    public void registrarEnVentanilla(){
        Ventanilla.getInstance().setCodigoDelCajero(getCodCajero());
    }
}
