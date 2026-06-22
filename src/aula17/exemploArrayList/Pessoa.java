package aula17.exemploArrayList;

import java.util.Objects;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private int matricula;

  public Pessoa(String nome, String sobrenome, int matricula){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Pessoa pessoa = (Pessoa) o;
    return matricula == pessoa.matricula && Objects.equals(nome, pessoa.nome) && Objects.equals(sobrenome, pessoa.sobrenome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sobrenome, matricula);
  }

  @Override
  public String toString(){
    String dados = "Nome: "+nome+" "+sobrenome;
    dados+="Matrícula: "+matricula;
    return dados;
  }
}
