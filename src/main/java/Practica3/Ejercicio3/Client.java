package Practica3.Ejercicio3;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Version version;

        // cambiando estados del objeto concreto BackupMarzo,
        version = new Version("version1");
        originator.setVersion(version);
        careTaker.addMemento(originator.createMemento());

        version= new Version("version2");
        originator.setVersion(version);
        careTaker.addMemento(originator.createMemento());

        version= new Version("version3");
        originator.setVersion(version);
        careTaker.addMemento(originator.createMemento());


        version= new Version("version4");
        originator.setVersion(version);
        careTaker.addMemento(originator.createMemento());

        version= new Version("version5");
        originator.setVersion(version);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(3));

    }
}
