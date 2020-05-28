package JorgeLopez.Ejericios.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIteratorListS2 implements Iterator {
    private int posicion;
    private List<Persona> personas = new ArrayList<Persona>();

    public ConcreteIteratorListS2(List<Persona> personas) {
        this.personas = personas;
        this.posicion = 0;
    }

    @Override
    public Object next() {
        return personas.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return this.personas.size() != 0 && posicion < this.personas.size();
    }
}
