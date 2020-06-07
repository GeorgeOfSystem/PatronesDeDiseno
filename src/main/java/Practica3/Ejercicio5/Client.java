package Practica3.Ejercicio5;

public class Client {

    public static void main (String [] argsss){
        Youtube youtube = new Youtube();

        Persona daniela = new Persona("Daniela","comedia");
        Persona nicole = new Persona("Nicole","terror");
        Persona riza = new Persona("Riza","ficcon");
        Persona jorge = new Persona("Jorge","acción");
        Persona ignacio = new Persona("Ignacio","comedia");


        youtube.attach(daniela);
        youtube.attach(nicole);
        youtube.attach(riza);
        youtube.attach(jorge);
        youtube.attach(ignacio);

        youtube.addVideo(new Video("comedia","vines","15:00","comedia"));
        youtube.addVideo(new Video("VideoMusical","Godzila-Eminem","30:00","anyCategory"));
    }
}
