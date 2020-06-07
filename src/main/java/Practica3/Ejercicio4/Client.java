package Practica3.Ejercicio4;

public class Client {

    public static void main (String [] args){

        Organizador organizador = new Organizador();

        organizador.answerOrder("Limpiezas");
        organizador.answerOrder("Manifestaciones");
        organizador.answerOrder("Desbloqueos");
        organizador.answerOrder("Disciplina");
        organizador.answerOrder("Entrevistas");
        organizador.answerOrder("Otros");

    }
}
