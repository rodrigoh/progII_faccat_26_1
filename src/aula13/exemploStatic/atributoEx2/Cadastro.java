package aula13.exemploStatic.atributoEx2;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Pessoa();
    p1.nome = "Jonas";
    p1.mail = "jonas";
    IO.println(p1.obterDados());
    Pessoa p2 = new Pessoa();
    p2.nome = "Ana";
    p2.mail = "ana";
    IO.println(p2.obterDados());
    IO.println("Até o momento temos "+ Pessoa.contPessoa+" pessoas cadastradas");
    Pessoa.dominio = "teste.com";
    IO.println(p1.obterDados());
    IO.println(p2.obterDados());
  }
}
