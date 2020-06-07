package Practica3.Ejercicio1;

public class Memento {
    private Backup backup;

    public Memento (Backup stateSaved){
        this.backup =stateSaved;
    }

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }
}
