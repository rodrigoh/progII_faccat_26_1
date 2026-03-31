package aula04.exemplosRepeticao;

public class ExemploWhile01 {
  static void main() {
    int i = 0;
    IO.println("Mostra os números de 0 a 9");
    while(i<10){
      IO.print(i+" ");
      i++;
    }
    i = 0;
    IO.println("\nMostra os números de 0 a 9");
    while(i<10){
      IO.print((i++)+" ");
    }
    i = 0;
    IO.println("\nMostra os números de 1 a 10");
    while(i<10){
      i++;
      IO.print(i+" ");
    }
    i = 0;
    IO.println("\nMostra os números de 1 a 10");
    while(i<10){
      IO.print((++i)+" ");
    }
  }
}
