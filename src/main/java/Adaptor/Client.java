package Adaptor;

public class Client {

    public static void main (String[] args){

        AutomovilElectrico automovilElectrico = new AutomovilElectrico();

        // misma familia
        AutomovilGasolina automovilGasolina = new AutomovilGasolina();
        AutomovilGasolinaEspecial automovilGasolinaEspecial = new AutomovilGasolinaEspecial();
        AutomovilDiesel automovilDiesel = new AutomovilDiesel();
        AdaptadorAutomovilElectrico automovilElectrico1= new AdaptadorAutomovilElectrico(automovilElectrico);

        System.out.println("Tipo Automóvil : Automovil a Gasolina ");
        automovilGasolina.llenarCombustible();
        System.out.println("Tipo Automóvil : Automovil a Gasolina Especial");
        automovilGasolinaEspecial.llenarCombustible();
        System.out.println("Tipo Automóvil : Automovil a Diesel ");
        automovilDiesel.llenarCombustible();
        System.out.println("Tipo Automóvil : Automovil Electrico ");
        automovilElectrico1.llenarCombustible();
    }


}
