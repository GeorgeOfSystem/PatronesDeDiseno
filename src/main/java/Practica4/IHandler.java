package Practica4;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(int amount,int prestamo);   // nuestra peticion

}
