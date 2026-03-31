package aula04.exemplosSelecao;

public class Exemplo02If {
  static void main() {
    int numero = Integer.parseInt(IO.readln("Digite um número: "));
    if(numero==0)
      IO.println("O número digitado foi zero");
    else if(numero>0)
      IO.println("O número "+numero+" é positivo");
    else {
      IO.println("O número " + numero + " é negativo");
      IO.println("Outra linha...");
    }
  }
}
