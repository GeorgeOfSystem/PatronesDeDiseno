package abstractFactory.State;

public class Client {
    public static void main(String[] abc){

        Dispensadora dispensadora = new Dispensadora();
        dispensadora.setDineroIntroducido(150);

        if (dispensadora.getPrecioProduct() == dispensadora.getDineroIntroducido() )
             dispensadora.setState(new Exacto());

        if ( dispensadora.getDineroIntroducido() > dispensadora.getPrecioProduct() )
            dispensadora.setState(new Superior());

        if (dispensadora.getDineroIntroducido() < dispensadora.getPrecioProduct() )
            dispensadora.setState(new Insuficiente());


        dispensadora.request();

        dispensadora.setDineroIntroducido(100);

        if (dispensadora.getPrecioProduct() == dispensadora.getDineroIntroducido() )
            dispensadora.setState(new Exacto());

        if ( dispensadora.getDineroIntroducido() > dispensadora.getPrecioProduct() )
            dispensadora.setState(new Superior());

        if (dispensadora.getDineroIntroducido() < dispensadora.getPrecioProduct() )
            dispensadora.setState(new Insuficiente());


        dispensadora.request();

        dispensadora.setDineroIntroducido(50);

        if (dispensadora.getPrecioProduct() == dispensadora.getDineroIntroducido() )
            dispensadora.setState(new Exacto());

        if ( dispensadora.getDineroIntroducido() > dispensadora.getPrecioProduct() )
            dispensadora.setState(new Superior());

        if (dispensadora.getDineroIntroducido() < dispensadora.getPrecioProduct() )
            dispensadora.setState(new Insuficiente());


        dispensadora.request();
    }

}
