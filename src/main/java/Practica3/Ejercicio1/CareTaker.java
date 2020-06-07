package Practica3.Ejercicio1;

import java.util.ArrayList;

public class CareTaker {

    private ArrayList <Memento> savedStates= new ArrayList<>();

    public void addMemento(Memento memento){
        this.savedStates.add(memento);
    }

    public Memento getMemento(int index){
        return  this.savedStates.get(index-1);
    }
}
