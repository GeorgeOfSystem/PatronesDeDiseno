package ChainOfResponsability;

public class Caja {
    private static Caja instance=null;
    private int amount;

    private Caja(){
        System.out.println("Creando LOG");
    }

    public static  Caja getInstance(){
        if (instance == null)
            instance = new Caja();

        return  instance;
    }
    public void depositar(int amount){
        this.amount = amount;
    }

    public boolean Prestamo(int prestamo){
        if(amount-prestamo >= 0){
            System.out.println("Prestamos realizado con exito");
            this.amount=amount-prestamo;
            System.out.println("Monto actual de la caja: " +amount);
            return true;
        }else{
            System.out.println("Prestamos rechazado, insuficiente saldo");
            return false;
        }

    }
}
