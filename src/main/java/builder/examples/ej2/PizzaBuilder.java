package builder.examples.ej2;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza(){ pizza = new Pizza(); }

    public abstract void agregarMasa();
    public abstract void agregarSalsa();
    public abstract void agregarTipoQueso();
}
