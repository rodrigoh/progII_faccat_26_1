package aula03.exemplosSelecao;

import java.util.Scanner;

public class ExemploSwitch01 {
  static void main() {
    int dia = Integer.parseInt(IO.readln("Digite um número de 1 a 7: "));
//    Scanner ler = new Scanner(System.in);
//    System.out.print("Digite um número de 1 a 7: ");
//    int dia = ler.nextInt();
    switch (dia){
      case 1:
        System.out.println("É domingo");
        System.out.println("É fim de semana");
        break;
      case 2:
        System.out.println("É segunda feira");
        break;
      case 3:
        System.out.println("É terça feira");
        break;
      case 4:
        System.out.println("É quarta feira");
        break;
      case 5:
        System.out.println("E quinta feira");
        break;
      case 6:
        System.out.println("É sexta feira");
        break;
      case 7:
        System.out.println("É sábado");
        System.out.println("É fim de semana");
        break;
      default:
        System.out.println("O número "+dia+" não corresponde a nenhum dia");
    }
  }
}
