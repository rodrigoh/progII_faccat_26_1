package aula13.exemploAcesso.model;

public class Pessoa {
  //É o nível de acesso mais liberal de todos
  public String nome;
  //protected é protegido de acesso para o mundo
  //mundo são classes que estão no mesmo projeto, mas não no mesmo pacote
  protected String sobrenome;
  //Sem modificador (acesso de pacote)
  String mail;
  //Acesso apenas pela classe
  private float salario;

  //Para modificar o valor do salário, usamos um setter
  public void setSalario(float salario) {
    if(salario>=0)
      this.salario = salario;
  }

  public float getSalario(){
    return salario;
  }
}
