package Practica3.Ejercicio1;

import java.util.ArrayList;

public class Backup {
    private String alias;
    static ArrayList<Personas> people = new ArrayList<>();

    public Backup(String name){
        this.alias =name;
    }

    public void showData(){
        System.out.println("name : "+this.alias);
        System.out.println("Quantity of peolple : "+this.people.size());
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Personas> getPeople() {
        return people;
    }

    public void addPerson(Personas persona) { people.add(persona); }
}
