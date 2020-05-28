package builder.examples.ej2;

public class PizzaHawaiana extends PizzaBuilder {
    @Override
    public void agregarMasa() { pizza.setMasa("Oregano"); }

    @Override
    public void agregarSalsa() { pizza.setSalsa("Tomate"); }

    @Override
    public void agregarTipoQueso() { pizza.setTipoQueso("Con Queso"); }
}
