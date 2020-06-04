package command;

import java.util.Date;

public class Receiver {

    private String reiniciar="reiniciado";
    private String apagar="apagado";
    private String cerrarSesion="cerrada la sesión actual";
    private String suspeder ="Suspendido";


    public void suspender(String usuario){
        System.out.println("COMMAND > Suspender\t>\t" + suspeder + "\nHora: " + new Date().toString());
        System.out.println("Usario actual: "+ usuario);
    }

    public void apagar(String usuario){
        System.out.println("COMMAND > Apagar\t>\t" + apagar+ "\nHora: " + new Date().toString());
        System.out.println("Usario actual: "+ usuario);
    }
    public void reiniciar(String usuario){
        System.out.println("COMMAND > Reiniciar\t>\t" + reiniciar+ "\nHora: " + new Date().toString());
        System.out.println("Usario actual: "+ usuario);
    }
    public void cerrarSesion(String usuario){
        System.out.println("COMMAND > Cerrrar Sesión\t>\t" + cerrarSesion+ "\nHora: " + new Date().toString());
        System.out.println("Usario actual: "+ usuario);
    }

    public String getReiniciar() {
        return reiniciar;
    }

    public void setReiniciar(String reiniciar) {
        this.reiniciar = reiniciar;
    }

    public String getApagar() {
        return apagar;
    }

    public void setApagar(String apagar) {
        this.apagar = apagar;
    }

    public String getCerrarSesion() {
        return cerrarSesion;
    }

    public void setCerrarSesion(String cerrarSesion) {
        this.cerrarSesion = cerrarSesion;
    }

    public String getSuspeder() {
        return suspeder;
    }

    public void setSuspeder(String suspeder) {
        this.suspeder = suspeder;
    }
}
