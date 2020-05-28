package JorgeLopez.Ejericios.ejercicio4;

public class FondoBanco {
    private static FondoBanco instance = null;
    private int fondo;

    public static FondoBanco getInstance(){
        if(instance == null)
         instance = new FondoBanco();

        return instance;
    }

    private FondoBanco (){
        System.out.println("Creando Fondo del Banco");
    }

    public void deposito (int deposito ){
        System.out.println("realizando el deposito, con un monto de: "+ deposito);
        this.fondo += deposito;
        System.out.println("monto final del fondo: "+ fondo);
    }

    public  void prestamo(int prestamo){
        fondo -= prestamo;
        System.out.println("prestamo aprobado, FondoBanco: "+fondo);
    }
}
