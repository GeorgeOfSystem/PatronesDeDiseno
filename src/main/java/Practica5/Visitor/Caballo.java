package Practica5.Visitor;

public class Caballo implements IAnimal {
    private String nombre;
    private int attribute2;

    // implementando patron visitor
    @Override
    public double curarEnfermedad1(IVisitor visitor) {
        return visitor.curar(this,"enfermedad1");
    }

    @Override
    public double curarEnfermedad2(IVisitor visitor) {
        return visitor.curar(this, "enfermedad2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}
