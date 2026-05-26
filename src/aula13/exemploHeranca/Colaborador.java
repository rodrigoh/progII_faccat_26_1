package aula13.exemploHeranca;

public class Colaborador {
  private String nome;
  private String sobrenome;
  private String matricula;
  private String mail;
  protected double salario;
  private static int contador = 0;

  public Colaborador(String matricula, String nome, String sobrenome){
    this.matricula = matricula;
    this.nome = nome;
    this.sobrenome = sobrenome;
    contador++;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setSalario(double salario){
    if(salario>=0)
      this.salario = salario;
  }

  public double getSalario(){
    return salario;
  }

  public int getContador(){
    return contador;
  }
}
