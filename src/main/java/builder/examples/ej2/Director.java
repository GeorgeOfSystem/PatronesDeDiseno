package builder.examples.ej2;

public class Director {
    private PizzaBuilder builder;

    public Pizza getBuilder(){ return builder.getPizza(); }

    public void setBuilder(PizzaBuilder  builder){ this.builder = builder; }

    public void crearPizza(){
        builder.createPizza();
        builder.agregarMasa();
        builder.agregarSalsa();
        builder.agregarTipoQueso();
    }
}
