package Practica3.Ejercicio1;

public class Originator {
    private Backup backup;

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        System.out.println("Set ----> Version -----");
        backup.showData();
        this.backup = backup;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Version  -----");
        backup.showData();
        return new Memento(this.backup);
    }

    public void restoreFromMemento(Memento n){
        this.backup = n.getBackup();
       System.out.println("Restore --- > Version -----");
        this.backup.showData();
    }

}
