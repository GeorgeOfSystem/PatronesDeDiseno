package factoryMethod.ejercicios.ej2;

public class CreatorKit_Escolar extends Creator {
    @Override
    public Kit_Escolar factoryMethodKit() {
        Kit_Escolar kit_escolar = new Kit_Escolar();
        kit_escolar.setMochila(new Mochila(5,42));
        kit_escolar.setCuadernos(new Cuadernos("matemáticas",300));
        kit_escolar.setDeportivo(new Deportivo("Xl","Azul", 3));
        return kit_escolar;
    }

}
