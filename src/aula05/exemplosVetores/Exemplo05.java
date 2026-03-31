package aula05.exemplosVetores;

import java.util.Random;

public class Exemplo05 {
  static void main() {
    Random aleatorio = new Random();
    //5 posições com índices de 0 a 4
    int[] vetor = new int[5];
    for (int i = 0; i <= 5; i++) {
      vetor[i] = aleatorio.nextInt(10);
      IO.print(vetor[i]+" ");
    }
  }
}
