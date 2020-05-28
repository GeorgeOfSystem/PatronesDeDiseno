package builder.examples.ej2;

public class Cliente {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder pizzaHawawiana = new PizzaHawaiana();
        PizzaBuilder pizzaCarnivora = new PizzaCarnivora();

        director.setBuilder(pizzaHawawiana);
        director.crearPizza();
        Pizza pizza1 = director.getBuilder();

        director.setBuilder(pizzaCarnivora);
        director.crearPizza();
        Pizza pizza2 = director.getBuilder();

        pizza1.showData();
        pizza2.showData();

    }
}
