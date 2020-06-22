package Practica5.Visitor;

public class Client {

    public static void main (String[]args  ){
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caballo caballo = new Caballo();

        Veterinario veterinario = new Veterinario(100);

        System.out.println("---------------------");
        perro.curarEnfermedad1(veterinario);
        perro.curarEnfermedad2(veterinario);

        System.out.println("---------------------");

        gato.curarEnfermedad1(veterinario);
        gato.curarEnfermedad2(veterinario);

        System.out.println("---------------------");
        caballo.curarEnfermedad1(veterinario);
        caballo.curarEnfermedad2(veterinario);

    }
}
