package Practica3.Ejercicio4;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void answerOrder(String order);   // nuestra orden

}
