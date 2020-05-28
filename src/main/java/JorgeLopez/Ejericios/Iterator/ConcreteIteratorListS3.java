package JorgeLopez.Ejericios.Iterator;

import java.util.Vector;

public class ConcreteIteratorListS3 implements Iterator {
    private int posicion;
    private Vector<Persona> personas;

    public ConcreteIteratorListS3(Vector<Persona> personas){
        this.personas=personas;
        this.posicion=0;
    }

    @Override
    public Object next() {

        return this.personas.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return this.personas.size() != 0 && posicion < this.personas.size();
    }
}
