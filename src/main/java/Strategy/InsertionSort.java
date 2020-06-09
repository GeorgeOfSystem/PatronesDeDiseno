package Strategy;

public class InsertionSort implements IStrategy {
    @Override
    public Estudiante[] execute(Estudiante[] estudiantes) {
        int[] promedios = new int[50];
        for(int i = 0 ; i < 50 ; i++){
            if(estudiantes[i] != null){
                promedios[i] = estudiantes[i].getPromedio();
            }
        }

        System.out.println("Algoritmo 3");
        for (int j = 1; j < 50; j++) {
            int key = promedios[j];
            int i = j-1;
            while ( (i > -1) && ( promedios[i] > key ) ) {
                promedios[i+1] = promedios[i];
                i--;
            }
            promedios[i+1] = key;
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
