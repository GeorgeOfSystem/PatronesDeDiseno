package JorgeLopez.Ejericios.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcreteListS2 implements IAggregate{
    private List<Persona> personas;

    public ConcreteListS2(){
        this.personas =  new ArrayList<Persona>();
    }

    public void add(Persona persona){
        personas.add(persona);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIteratorListS2(this.personas);
    }
}
