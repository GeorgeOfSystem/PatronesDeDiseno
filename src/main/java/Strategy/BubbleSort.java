package Strategy;

public class BubbleSort implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] estudiantes) {
        int[] promedios = new int[50];
        for(int i = 0 ; i < 50 ; i++){
            if(estudiantes[i] != null){
                promedios[i] = estudiantes[i].getPromedio();
            }
        }

        System.out.println("Algoritmo 2");
        for(int i = 0 ; i < 49 ; i++){
            if( promedios[i]>promedios[i+1]){
                int c = promedios[i+1];
                promedios[i+1] = promedios[i];
                promedios[i] = c;
            }
        }

        for (int i = 0 ; i < 50 ; i++){
            for (int j = 0 ; j < 50 ; j++){
                if(estudiantes[j] !=null && estudiantes[j].getPromedio() == promedios[i]){
                    System.out.println(estudiantes[j].getNombre() + " " + estudiantes[j].getPromedio());
                }
            }
        }

        return estudiantes;
    }
}
