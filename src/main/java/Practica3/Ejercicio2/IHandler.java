package Practica3.Ejercicio2;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Requisitos requisito);   // nuestra peticion

}
