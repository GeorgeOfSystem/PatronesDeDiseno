package JorgeLopez.Ejericios.ejercicio4;

public class Cajero {
    private Prestamo prestamo = new Prestamo();
    private int montoPrestamo;

    public Cajero(String tipoPrestamo, int montoPrestamo){
        prestamo.setTipoDePrestamo(tipoPrestamo);
        prestamo.setCantidadPrestamo(montoPrestamo);
        this.montoPrestamo = montoPrestamo;
    }

    public void realizarPrestamo(){
        FondoBanco.getInstance().prestamo(montoPrestamo);
    }
}
