package abstractFactory.ejercicios.ej2;

public class Cliente {
    public static void main(String[] args) {
        FactoryProduct.make(FactoryProduct.Materias.Mate).inscribirse(new Estudiante("Nicole","Arcienega"));
        FactoryProduct.make(FactoryProduct.Materias.Mate).inscribirse(new Estudiante("Jorge","López"));
        FactoryProduct.make(FactoryProduct.Materias.Historia).inscribirse(new Estudiante("Juan Pablo","Torres"));
        FactoryProduct.make(FactoryProduct.Materias.Ingle).inscribirse(new Estudiante("Daniela","Angles"));
        FactoryProduct.make(FactoryProduct.Materias.Lenguaje).inscribirse(new Estudiante("Igancio","Rojas"));
    }
}
