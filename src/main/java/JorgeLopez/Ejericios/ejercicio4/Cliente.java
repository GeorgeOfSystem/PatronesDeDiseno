package JorgeLopez.Ejericios.ejercicio4;

public class Cliente {
    //Nota: para practicar hice una mezcla de singleton con prototype
    //Prototype: Prestamos
    //Singleton: FondoBando
    public static void main(String[] args) {
        FondoBanco.getInstance().deposito(5000);
        Cajero cajero1 = new Cajero("Vivienda",250);
        cajero1.realizarPrestamo();
        Cajero cajero2 = new Cajero("Viaje",50);
        cajero2.realizarPrestamo();
        Cajero cajero3 = new Cajero("Auto",150);
        cajero3.realizarPrestamo();
        
    }
}
