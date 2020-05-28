package JorgeLopez.Ejericios.Iterator;

import iterator.basic.IteratorConcreteListB;

import java.util.HashMap;
import java.util.Vector;

public class ConcreteListS3 implements IAggregate {
    Vector<Persona> personas;

    public ConcreteListS3(){
        personas = new Vector<>();
    }

    public void add(Persona persona){
        personas.add(persona);
    }

    @Override
    public ConcreteIteratorListS3 iterator() {
        return new ConcreteIteratorListS3(this.personas);
    }
}
