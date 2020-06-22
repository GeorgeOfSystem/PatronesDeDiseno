package Practica5.Visitor;

public interface IVisitor {

    double curar(Perro perro, String msg);
    double curar(Gato gato,String msg);
    double curar(Caballo caballo,String msg);
}
