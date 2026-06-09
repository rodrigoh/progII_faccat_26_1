package aula15.exemploAbtrato.exemplo01;
//Classes abstratas podem ter comportamentos concretos, atributos
//Classes abstratas tem métodos abstratos
public abstract class Figura {
    private String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();
}
