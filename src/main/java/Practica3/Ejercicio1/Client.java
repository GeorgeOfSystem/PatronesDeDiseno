package Practica3.Ejercicio1;

public class Client {

    public  static  void main (String[]args){

        CareTaker careTaker = new CareTaker();
        Originator originator= new Originator();

        Backup backup;

        // cambiando estados del objeto concreto BackupMarzo,
        backup = new Backup("BackupEnero");
        backup.addPerson(new Personas("Katyas",3132317,19));
        originator.setBackup(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new Backup("BackupFebrero");
        backup.addPerson(new Personas("Daniela",14609067,21));
        originator.setBackup(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new Backup("BackupMarzo");
        backup.addPerson(new Personas("Jorge",286090988,20));
        backup.addPerson(new Personas("Nicole",13609754,19));
        originator.setBackup(backup);
        careTaker.addMemento(originator.createMemento());


        backup= new Backup("BackupAbil");
        backup.addPerson(new Personas("Ignacio",6090958,22));
        originator.setBackup(backup);
        careTaker.addMemento(originator.createMemento());

        backup= new Backup("BackupMayo");
        backup.addPerson(new Personas("JuanPablo",66604666,28));
        originator.setBackup(backup);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(2));

    }
}
