package JorgeLopez.Ejericios.Iterator;

import java.util.HashMap;

public class ConcreteIteratorListS1 implements Iterator{
    private int posicion;
    private Persona[] personas;

    public ConcreteIteratorListS1(Persona[] personas) {
        this.personas = personas;
        this.posicion = 0;
    }

    @Override
    public Object next() {
        return this.personas[posicion++];
    }

    @Override
    public boolean hasNext() {
        return this.personas.length != 0 && posicion < this.personas.length;
    }
}
