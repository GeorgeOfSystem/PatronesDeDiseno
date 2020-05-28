package factoryMethod.ejercicios.ej2;

public class Kit_Colegial implements IKit{

    Mochila mochila;
    Libros libros;
    Computadora cpu;

    @Override
    public void accion() {
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getCpu() {
        return cpu;
    }

    public void setCpu(Computadora cpu) {
        this.cpu = cpu;
    }
}
