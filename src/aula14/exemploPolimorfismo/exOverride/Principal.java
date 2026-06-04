package aula14.exemploPolimorfismo.exOverride;

public class Principal {
  static void main() {
    Conta c1 = new Conta("Jonas");
    IO.println(c1.verificaSaldo());
    if(c1.sacar(100)){
      IO.println("Saque realizado");
    }
    else{
      IO.println("Saldo insuficiente");
    }

    ContaCorrente cc1 = new ContaCorrente("Ana",100);
    IO.println(cc1.verificaSaldo());
    if(cc1.sacar(50)){
      IO.println("Saque realizado");
    }

    IO.println(cc1.verificaSaldo());
    IO.println("------------------------");
    IO.println(c1);
    IO.println("------------------------");
    IO.println(cc1);

  }
}
