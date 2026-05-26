package aula13.exemploHeranca;

public class Engenheiro extends Colaborador{
  private String crea;

  public Engenheiro(String matricula, String nome, String sobrenome,String crea) {
    super(matricula, nome, sobrenome);
    this.crea = crea;
  }

  public String getCrea() {
    return crea;
  }

  public void setCrea(String crea) {
    this.crea = crea;
  }
}
