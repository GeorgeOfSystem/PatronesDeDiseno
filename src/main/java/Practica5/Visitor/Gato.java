package Practica5.Visitor;

public class Gato implements IAnimal {
    private int attribute1;
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

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}
