package aula03.exemplosSelecao;

public class ExemploIf01 {
  //Operadores relacionais
  //> maior que
  //< menor que
  //>= maior ou igual a
  //<= menor ou igual a
  //== igual a
  //!= diferente (não igual)
  //equals
  //OPeradores lógicos
  // || OU lógico preciso que um dos termos da expressão seja verdade para ter um resutlado
  //verdadeiro
  // && E lógico preciso que os dois termos da expressão sejam verdade para ter um resultado
  //verdadeiro
  // ! Não o que é verdade vira falso e o que é falso vira verdade
  static void main() {
    int numero = Integer.parseInt(IO.readln("Digite um número: "));

    if(numero==0)
      IO.println("O número é zero");
    else if(numero>0)
      IO.println("O número "+numero+" é positivo");
    else
      IO.println("O número "+numero+" é negativo");

    if(numero==0)
      IO.println("O número é zero");
    if(numero>0)
      IO.println("O número "+numero+" é positivo");
    if(numero<0) {
      IO.println("O número " + numero + " é negativo");
      IO.println("O valor é menor que zero");
    }
  }
}
