package Practica3.Ejercicio3;

public class Memento {
    private Version version;

    public Memento (Version stateSaved){
        this.version =stateSaved;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
