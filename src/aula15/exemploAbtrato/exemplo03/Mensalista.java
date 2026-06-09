package aula15.exemploAbtrato.exemplo03;

public class Mensalista extends Funcionario{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaSalario() {
        return salario;
    }
}
