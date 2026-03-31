package aula03.exemplosSelecao;

public class ExemploSwitch02 {
  static void main() {
    int dia = Integer.parseInt(IO.readln("Digite um número de 1 a 7: "));

    switch (dia){
      case 1 -> {
        System.out.println("É domingo");
        System.out.println("É fim de semana");
      }
      case 2 -> System.out.println("É segunda feira");
      case 3 -> System.out.println("É terça feira");
      case 4 -> System.out.println("É quarta feira");
      case 5 -> System.out.println("E quinta feira");
      case 6 -> System.out.println("É sexta feira");
      case 7 -> {
        System.out.println("É sábado");
        System.out.println("É fim de semana");
      }
      default-> System.out.println("O número "+dia+" não corresponde a nenhum dia");
    }
  }
}
