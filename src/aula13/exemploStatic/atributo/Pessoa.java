package aula13.exemploStatic.atributo;

public class Pessoa {
  //O atributo contPessoa é o mesmo para todas as instâncias
  //Desta forma ele pode se comportar como um identificador único
  static int contPessoa=0;
  String nome;
  String mail;

  Pessoa(){
    contPessoa++;
  }

  public String obterDados(){
    String dados = "Nome: "+nome;
    dados+="\nE-mail: "+mail;
    dados+="\nID: "+contPessoa;
    return dados;
  }


}
