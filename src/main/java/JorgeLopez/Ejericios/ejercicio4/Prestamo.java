package JorgeLopez.Ejericios.ejercicio4;

public class Prestamo implements IPrestamo{
    private String tipoDePrestamo;
    private  int cantidadPrestamo;

    @Override
    public Object clone() {
        Prestamo obClone = new Prestamo();
        obClone.setTipoDePrestamo(this.tipoDePrestamo);
        obClone.setCantidadPrestamo(this.cantidadPrestamo);
        return obClone;
    }

    public String getTipoDePrestamo() {
        return tipoDePrestamo;
    }

    public void setTipoDePrestamo(String tipoDePrestamo) {
        this.tipoDePrestamo = tipoDePrestamo;
    }

    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }
}
