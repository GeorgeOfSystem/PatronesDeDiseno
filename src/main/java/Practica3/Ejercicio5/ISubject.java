package Practica3.Ejercicio5;

public interface ISubject {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver(String categoriaVideo);
}
