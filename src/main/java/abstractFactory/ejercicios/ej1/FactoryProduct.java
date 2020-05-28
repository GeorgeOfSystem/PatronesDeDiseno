package abstractFactory.ejercicios.ej1;

public class FactoryProduct {
    public enum iceCream{
        HeladoCrema,HeladoAgua,HeladoMixto
    }

    public static IIceCreamProduct make(iceCream iceCream){

        IIceCreamProduct product;

            switch (iceCream){
                case HeladoAgua:
                    product =  new HeladoAgua();
                    break;
                case HeladoCrema:
                    product =  new HeladoCrema();
                    break;
                case HeladoMixto:
                    product =  new HeladoMixto();
                    break;
                default:
                    product =  new HeladoAgua();
                    break;
            }
        return product;
    }
}
