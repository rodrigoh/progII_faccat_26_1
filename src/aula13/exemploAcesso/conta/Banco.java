package aula13.exemploAcesso.conta;

public class Banco {
  static void main() {
    /*
    Depois de criada uma conta o identificador não pode ser alterado
    saldo não ser modificado diretamente
     */
    Conta c1 = new Conta("Jonas");
    IO.println(c1.mostraInformacoes());
    c1.depositar(1000);
    IO.println(c1.mostraInformacoes());
    //c1.saldo = -1;
    c1.sacar(100);
    IO.println(c1.mostraInformacoes());
    //c1.identificador = "teste";
  }
}
