package JorgeLopez.Ejericios.Iterator;

import java.util.HashMap;

public class Cliente {
    public static void main(String[] args) {
        HashMap<Persona,String> todasLasPersonas = new HashMap<Persona,String>();

        ConcreteListS1 s1 = new ConcreteListS1();
        s1.add(new Persona("Juan1",1));
        s1.add(new Persona("Juan2",2));
        s1.add(new Persona("Juan3",3));
        s1.add(new Persona("Juan4",4));
        s1.add(new Persona("Juan5",5));

        ConcreteListS2 s2 = new ConcreteListS2();
        s2.add(new Persona("Nicole1",1));
        s2.add(new Persona("Nicole2",2));
        s2.add(new Persona("Nicole3",3));
        s2.add(new Persona("Nicole4",4));
        s2.add(new Persona("Nicole5",5));

        ConcreteListS3 s3 = new ConcreteListS3();
        s3.add(new Persona("Jorge1",1));
        s3.add(new Persona("Jorge2",2));
        s3.add(new Persona("Jorge3",3));
        s3.add(new Persona("Jorge4",4));
        s3.add(new Persona("Jorge5",5));

        Iterator iterator;
        iterator = s1.iterator();
        int i=0;
        while (iterator.hasNext()){
            Persona p = (Persona) iterator.next();
            todasLasPersonas.put(p,p.getNombre());
            System.out.println("Sistema1 > nombre : "+ p.getNombre());
        }

        iterator = s2.iterator();
        i=0;
        while (iterator.hasNext()){
            Persona p = (Persona) iterator.next();
            todasLasPersonas.put(p,p.getNombre());
            System.out.println("Sistema2 > nombre : "+ p.getNombre());
        }

        iterator = s3.iterator();
        i=0;
        while (iterator.hasNext()){
            Persona p = (Persona) iterator.next();
            todasLasPersonas.put(p,p.getNombre());
            System.out.println("Sistema3 > nombre : "+ p.getNombre());
        }

    }
}
