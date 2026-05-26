package aula13.exemploAcesso.controller;

import aula13.exemploAcesso.model.Pessoa;

public class Cadastro {
  static void main() {
    Pessoa p1 = new Pessoa();
    p1.nome = "Jonas";
    //Como o atributo salário é privado na classe Pessoa
    //Não pode ser acessado diretamente
    //Isso previne modificações indevidas
    //p1.salario = -10;
    //Para alterar o salário usamos o setter
    p1.setSalario(15_000);
    IO.println("O "+p1.nome+" recebe "+p1.getSalario());
  }
}
