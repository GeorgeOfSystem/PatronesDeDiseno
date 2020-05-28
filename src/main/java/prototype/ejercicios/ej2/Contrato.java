package prototype.ejercicios.ej2;

public class Contrato implements IContrato{

    private int sueldo;
    private int carga_horaria;
    private boolean curso_educacion_superior;
    private boolean acceso_plataforma;
    private boolean marcado_biometrico;
    private String hora_de_entrada;
    private String hora_de_salida;
    private Docente docente;

    @Override
    public Object clone() {
        Contrato objClonado = new Contrato();
        objClonado.setSueldo(this.sueldo);
        objClonado.setCarga_horaria(this.carga_horaria);
        objClonado.setCurso_educacion_superior(this.curso_educacion_superior);
        objClonado.setAcceso_plataforma(this.acceso_plataforma);
        objClonado.setMarcado_biometrico(this.marcado_biometrico);
        objClonado.setHora_de_entrada(this.hora_de_entrada);
        objClonado.setHora_de_salida(this.hora_de_salida);
        objClonado.setDocente(this.docente);
        return objClonado;
    }

    public int getSueldo() { return sueldo; }

    public void setSueldo(int sueldo) { this.sueldo = sueldo; }

    public int getCarga_horaria() { return carga_horaria; }

    public void setCarga_horaria(int carga_horaria) { this.carga_horaria = carga_horaria; }

    public boolean isCurso_educacion_superior() { return curso_educacion_superior; }

    public void setCurso_educacion_superior(boolean curso_educacion_superior) { this.curso_educacion_superior = curso_educacion_superior; }

    public boolean isAcceso_plataforma() { return acceso_plataforma; }

    public void setAcceso_plataforma(boolean acceso_plataforma) { this.acceso_plataforma = acceso_plataforma; }

    public boolean isMarcado_biometrico() { return marcado_biometrico; }

    public void setMarcado_biometrico(boolean marcado_biometrico) { this.marcado_biometrico = marcado_biometrico; }

    public String getHora_de_entrada() { return hora_de_entrada; }

    public void setHora_de_entrada(String hora_de_entrada) { this.hora_de_entrada = hora_de_entrada; }

    public String getHora_de_salida() { return hora_de_salida; }

    public void setHora_de_salida(String hora_de_salida) { this.hora_de_salida = hora_de_salida; }

    public Docente getDocente() { return docente; }

    public void setDocente(Docente docente) { this.docente = docente; }

    public void showData(){
        System.out.println("--------Contrato--------");
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Carga Horaria: " + carga_horaria);
        System.out.println("Curso Educacion Superior: " + curso_educacion_superior);
        System.out.println("Acceso Plataforma: " + acceso_plataforma);
        System.out.println("Marcado Biometrico: " + marcado_biometrico);
        System.out.println("Hora de Entrada: " + hora_de_entrada);
        System.out.println("Hora de Salida: " + hora_de_salida);

    }
}
