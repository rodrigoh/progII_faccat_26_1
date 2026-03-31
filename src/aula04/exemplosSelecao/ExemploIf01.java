package aula04.exemplosSelecao;

import java.util.Scanner;

public class ExemploIf01 {
  static void main() {
    float nota = Float.parseFloat(IO.readln("Digite uma nota: "));
//    System.out.print("Digite uma nota: ");
//    nota = new Scanner(System.in).nextFloat();
    //válida é nota>=1 && nota <=10
    if(nota>=1 && nota<=10)
      IO.println("A nota digitada é válida");
    else
      IO.println("A nota digitada é inválida");

    if(nota<1 || nota>10)
      IO.println("A nota %.2f é inválida".formatted(nota));

  }
}
