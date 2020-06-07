package Practica3.Ejercicio3;

import Practica3.Ejercicio1.Personas;

import java.util.ArrayList;

public class Version {
    private String name;

    public Version(String name){
        this.name =name;
    }

    public void showData(){
        System.out.println("name : "+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
