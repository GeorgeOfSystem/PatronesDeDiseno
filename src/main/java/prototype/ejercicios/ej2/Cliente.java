package prototype.ejercicios.ej2;

public class Cliente {

    public static void main(String[] args) {
        Contrato contrato1 = new Contrato();
        contrato1.setSueldo(5000);
        contrato1.setCarga_horaria(80);
        contrato1.setCurso_educacion_superior(true);
        contrato1.setAcceso_plataforma(true);
        contrato1.setMarcado_biometrico(false);
        contrato1.setHora_de_entrada("08:00");

        contrato1.setHora_de_salida("18:00");
        contrato1.setDocente(new Docente("Nicole","Arcienega"));

        Contrato contrato2 = (Contrato) contrato1.clone();
        contrato2.setDocente(new Docente("Maurico","Vejarano"));

        Contrato contrato3 = (Contrato) contrato1.clone();
        contrato3.setDocente(new Docente("Mauricio","Ayllón"));

        Contrato contrato4 = (Contrato) contrato1.clone();
        contrato4.setDocente(new Docente("Jordi","Ugarte"));

        Contrato contrato5 = (Contrato) contrato1.clone();
        contrato5.setDocente(new Docente("Maria","Angelica"));

        Contrato contrato6 = (Contrato) contrato1.clone();
        contrato6.setDocente(new Docente("Maria","Cano"));

        Contrato contrato7 = (Contrato) contrato1.clone();
        contrato7.setDocente(new Docente("Kathya","Rojas"));

        Contrato contrato8 = (Contrato) contrato1.clone();
        contrato8.setDocente(new Docente("Arturo","López"));

        Contrato contrato9 = (Contrato) contrato1.clone();
        contrato9.setDocente(new Docente("Ignacio","Caero"));

        Contrato contrato10 = (Contrato) contrato1.clone();
        contrato10.setDocente(new Docente("André","Caero"));

        Contrato contrato11 = (Contrato) contrato1.clone();
        contrato11.setDocente(new Docente("Lucas","Olguin"));

        Contrato contrato12 = (Contrato) contrato1.clone();
        contrato12.setDocente(new Docente("Joaquin","Olguin"));

        Contrato contrato13 = (Contrato) contrato1.clone();
        contrato13.setDocente(new Docente("Cristopher","Rojas"));

        Contrato contrato14 = (Contrato) contrato1.clone();
        contrato14.setDocente(new Docente("Michelle","López"));

        Contrato contrato15 = (Contrato) contrato1.clone();
        contrato15.setDocente(new Docente("Juan Pablo","López"));

        contrato1.showData();
        contrato2.showData();
        contrato3.showData();
        contrato4.showData();
        contrato5.showData();
        contrato6.showData();
        contrato7.showData();
        contrato8.showData();
        contrato9.showData();
        contrato10.showData();
        contrato11.showData();
        contrato12.showData();
        contrato13.showData();
        contrato14.showData();
        contrato15.showData();


    }
}
