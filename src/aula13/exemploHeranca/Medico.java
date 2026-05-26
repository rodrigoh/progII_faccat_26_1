package aula13.exemploHeranca;

public class Medico extends Colaborador{
  private String crm;

  public Medico(String matricula, String nome, String sobrenome, String crm){
    super(matricula,nome,sobrenome);
    this.crm = crm;
  }
  public String getCrm() {
    return crm;
  }

  public void setCrm(String crm) {
    this.crm = crm;
  }

  public void aumento(int percentual){
    salario = salario+salario*(percentual/100f);
    //salario = salario*1+(percentual/100f);
  }
}
