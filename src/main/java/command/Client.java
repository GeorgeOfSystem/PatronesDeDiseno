package command;

public class Client {
    public static void main (String[]args){
        Receiver receiver = new Receiver("Juan");

        Reiniciar reiniciar = new Reiniciar(receiver);
        Apagar apagar = new Apagar(receiver);
        CerrarSesión cerrarSesión = new CerrarSesión(receiver);
        Suspender suspender = new Suspender(receiver);

        Computadora computadora = new Computadora();

        // agregando comandos concretos
        computadora.setCommand(reiniciar);
        computadora.setCommand(apagar);
        computadora.setCommand(cerrarSesión);
        computadora.setCommand(suspender);

        // ejecutar todos los comando
        computadora.runCommand();

    }

}
