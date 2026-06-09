package aula15.exemploAbtrato.exemplo03;

public class Horista extends Funcionario{
    private double valorHora;
    private int quantHoras;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    @Override
    public double calculaSalario() {
        return quantHoras*valorHora;
    }
}
