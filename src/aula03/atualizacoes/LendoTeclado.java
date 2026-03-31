package aula03.atualizacoes;

public class LendoTeclado {
  static void main() {
    //Lendo um inteiro com o readln()
    System.out.print("Digite um número: ");
    // numero = int(input())
    int numero = Integer.parseInt(IO.readln());

    //Lendo um float do teclado
    // valor = float(input("Digite um número real: "))
    //Ao digitar no terminal, use . e não , como no Scanner
    float valor = Float.parseFloat(IO.readln("Digite um número real: "));

    //Lendo uma String do teclado
    // atalho -> ior
    String frase = IO.readln("Digite uma frase: ");
    // atalho -> iop
    IO.println("Frase: "+frase);
    IO.println("Número: "+numero);
    IO.println("Valor: %.2f".formatted(valor));
  }
}
