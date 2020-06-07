package Practica3.Ejercicio2;

public class Requisitos {
    private String certificadoNacimiento;
    private boolean pagoBanco;
    private boolean ficha;

    public void setCertificadoNacimiento(String certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public void setPagoBanco(Boolean pagoBanco) {
        this.pagoBanco = pagoBanco;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }

    public Requisitos(String certificadoNacimiento, Boolean pagoBanco, boolean ficha) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoBanco = pagoBanco;
        this.ficha = ficha;
    }

    public String getCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public Boolean getPagoBanco() {
        return pagoBanco;
    }

    public boolean getFicha() {
        return ficha;
    }
}
