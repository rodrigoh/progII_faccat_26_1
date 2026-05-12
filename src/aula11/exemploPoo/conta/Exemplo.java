package aula11.exemploPoo.conta;

public class Exemplo {
  static void main() {
    String titular = IO.readln("Qual seu nome: ");
    Conta c1 = new Conta(titular);
    IO.println(c1.mostraInformacoes());
    float valor = Float.parseFloat(IO.readln("Qual valor deseja depositar: "));
    c1.depositar(valor);
    valor = Float.parseFloat(IO.readln("Qual valor deseja sacar: "));
    if(c1.sacar(valor)){
      IO.println("Saque de R$%.2f realizado com sucesso".formatted(valor));
    }
    else {
      IO.println("Saldo insufuciente");
    }
  }
}
