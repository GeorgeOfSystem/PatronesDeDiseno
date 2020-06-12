package Practica4;

public class Client {

    public static void main (String[] args){

        Persona juan1 = new Persona("Juan1",100);
        Persona juan3 = new Persona("Juan3",100);
        Persona juan2 = new Persona("Juan2",100);
        Persona juan4 = new Persona("Juan4",100);
        Persona juan5 = new Persona("Juan5",500);

        juan1.depositar(10);
        juan2.depositar(30);
        juan3.depositar(60);
        juan4.depositar(100);
        juan5.depositar(600);
    }
}
