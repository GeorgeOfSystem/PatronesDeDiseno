package builder.examples.ej2;

public class PizzaCarnivora extends PizzaBuilder {
    @Override
    public void agregarMasa() { pizza.setMasa("Integral"); }

    @Override
    public void agregarSalsa() { pizza.setSalsa("Tomate"); }

    @Override
    public void agregarTipoQueso() { pizza.setTipoQueso("Parmesano"); }
}
