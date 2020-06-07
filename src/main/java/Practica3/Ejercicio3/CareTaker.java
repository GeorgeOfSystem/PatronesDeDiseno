package Practica3.Ejercicio3;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList <Memento> versiones = new ArrayList<>();

    public void addMemento(Memento memento){
        this.versiones.add(memento);
    }

    public Memento getMemento(int index){
        return  this.versiones.get(index-1);
    }
}
