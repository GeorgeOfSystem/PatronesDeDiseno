package Strategy;


public class Colegio {

    private IStrategy strategy;
    private Estudiante[] estudiantes = new Estudiante[50];

    public Colegio(){}

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute(estudiantes);
    }

    public void addEstudiante(Estudiante estudiante){
        for (int i = 0 ; i < 50 ; i++){
            if(estudiantes[i] == null){
                estudiantes[i] = estudiante;
                i = estudiantes.length;
            }
        }
    }
}
