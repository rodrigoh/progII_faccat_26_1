package aula09.correcaoProva;

import java.util.Random;

public class Ex18 {
  static void main() {
    Random aleatorio = new Random();
    int tam = 10;
    int[] vetor = new int[tam];
    int[] pares = new int[tam];
    int ip = 0;
    for (int i = 0; i < tam; i++) {
      vetor[i] = aleatorio.nextInt(1,50);
      IO.print(vetor[i]+" ");
      if(vetor[i]%2==0){
        pares[ip] = vetor[i];
        ip++;
      }
    }
    IO.println("\nSão pares");
    for (int i = 0; i < ip; i++) {
      IO.print(pares[i]+" ");
    }
  }

}
