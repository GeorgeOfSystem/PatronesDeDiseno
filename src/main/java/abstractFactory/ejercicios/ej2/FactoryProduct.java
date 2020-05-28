package abstractFactory.ejercicios.ej2;

public class FactoryProduct {

    public enum Materias { Mate, Lenguaje, Ingle, Historia }

    public static IInscripcion make(Materias materias){
        IInscripcion materia;
        switch (materias){
            case Mate:
                materia = new Mate();
                break;
            case Ingle:
                materia = new Ingles();
                break;
            case Historia:
                materia = new Historia();
                break;
            case Lenguaje:
                materia = new Lenguaje();
                break;
            default:
                materia = new Mate();
                break;
        }
        return materia;
    }
}
