package singleton.examples.ej2;



public class Ventanilla {
    private static Ventanilla instance = null;
    private int monto;
    private int codigoDelCajero;

    private Ventanilla () {System.out.println("Creando Ventanilla");}

    public static Ventanilla getInstance() {
        if (instance == null) {
            instance = new Ventanilla();
        }
        return  instance;
    }

    public void getMonto() {
        System.out.println( "Cajero: "+getCodigoDelCajero() +"\t"+"el monto de la ventanilla es: "+ monto);
    }

    public int getCodigoDelCajero() {
        return  codigoDelCajero;
    }

    public void setCodigoDelCajero(int codigoDelCajero) {
        System.out.println("Registando cajero con codigo: " + codigoDelCajero );
        this.codigoDelCajero = codigoDelCajero;
    }

    public void pagar(int monto, String estudiante) {
        System.out.println(estudiante.toUpperCase()+ "paga su deuda de: " + monto );
        this.monto = this.monto + monto;
    }
}
