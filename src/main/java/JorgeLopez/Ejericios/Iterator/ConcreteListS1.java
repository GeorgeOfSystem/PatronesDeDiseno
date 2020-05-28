package JorgeLopez.Ejericios.Iterator;

import iterator.basic.IteratorConcreteListA;

import java.util.HashMap;

public class ConcreteListS1 implements IAggregate{
    private int posicion;
    private Persona[] personas;

    public ConcreteListS1() {
        this.posicion = 0;
        this.personas = new Persona[5];
    }

    public void add (Persona persona){
        personas[posicion] = persona;
        posicion++;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIteratorListS1(this.personas);
    }
}
