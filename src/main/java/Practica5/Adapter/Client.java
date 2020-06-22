package Practica5.Adapter;

public class Client {

    public static void main (String[] args){

        Television adaptee1 = new Television();
        Lavador adaptee2 = new Lavador();
        Refrigerador adaptee3 = new Refrigerador();

        AdapterTelevisor concreteAdapter1= new AdapterTelevisor(adaptee1);
        AdapterLavador concreteAdapter2 = new AdapterLavador(adaptee2);
        AdapterRefrigerador concreteAdapter3 = new AdapterRefrigerador(adaptee3);

        System.out.println(" ----------- Television ---------- ");
        concreteAdapter1.tiempoDeVida(5);
        concreteAdapter1.presio(1);

        System.out.println(" ----------- Lavador ---------- ");
        concreteAdapter2.tiempoDeVida(5);
        concreteAdapter2.presio(1);

        System.out.println(" ----------- Refrigerador ---------- ");
        concreteAdapter3.tiempoDeVida(5);
        concreteAdapter3.presio(1);

        Celulares concreteA= new Celulares();
        System.out.println(" ----------- Celular ---------- ");
        concreteA.tiempoDeVida(5);
        concreteA.presio(20);

        Tablets concreteB = new Tablets();
        System.out.println(" ----------- Tablet ---------- ");
        concreteB.tiempoDeVida(5);
        concreteB.presio(20);

        Computadoras concreteC = new Computadoras();
        System.out.println(" ----------- Computadora  ---------- ");
        concreteC.tiempoDeVida(5);
        concreteC.presio(1);
    }


}
