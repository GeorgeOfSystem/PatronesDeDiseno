package Practica3.Ejercicio3;

public class Originator {
    private Version version;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        System.out.println("Set ----> Version -----");
        version.showData();
        this.version = version;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Version  -----");
        version.showData();
        return new Memento(this.version);
    }

    public void restoreFromMemento(Memento n){
        this.version = n.getVersion();
       System.out.println("Restore --- > Version -----");
        this.version.showData();
    }

}
