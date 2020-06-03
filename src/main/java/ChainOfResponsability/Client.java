package ChainOfResponsability;

public class Client {

    public static void main (String[] args){
        Caja.getInstance().depositar(70);

        Persona juan1 = new Persona("Juan1",159,5);
        Persona juan2 = new Persona("Juan2",123,15);
        Persona juan3 = new Persona("Juan3",456,25);
        Persona juan4 = new Persona("Juan4",789,55);

        juan1.consultarPrestamo();
        juan2.consultarPrestamo();
        juan3.consultarPrestamo();
        juan4.consultarPrestamo();
    }
}
