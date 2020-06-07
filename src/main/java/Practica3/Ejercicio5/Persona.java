package Practica3.Ejercicio5;

public class Persona implements IObserver {
    private  String name;
    private String categoriaMsg;

    public Persona(String name, String categoriaMsg) {
        this.name = name;
        this.categoriaMsg = categoriaMsg;
    }

    @Override
    public String getCategoriaMsg() {
        return categoriaMsg;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+" > [Notificacion]"+msg);
    }
}
