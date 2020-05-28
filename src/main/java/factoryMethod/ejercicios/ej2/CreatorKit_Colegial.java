package factoryMethod.ejercicios.ej2;

public class CreatorKit_Colegial extends Creator {

    @Override
    public Kit_Colegial factoryMethodKit() {
        Kit_Colegial kit_colegial = new Kit_Colegial();
        kit_colegial.setMochila(new Mochila(4,32));
        kit_colegial.setCpu(new Computadora("Dell","CentosOs7"));
        kit_colegial.setLibros(new Libros("Aprendizaje","Harrison"));
        return kit_colegial;
    }
}
