package aula06.exercicios;

import java.util.Random;

/**
 * Criar um vetor A com 5 elementos, carregar ele com números aleatórios.
 * Declarar um vetor B. Copiar todos os elementos do Vetor A para o Vetor B e mostrar
 * os dois na tela;
 */
public class Ex01 {
  static void main() {
    Random aleatorio = new Random();
    int[] vetorA = new int[5];
    IO.println("Dados no vetorA");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = aleatorio.nextInt(15);
      IO.print(vetorA[i]+" ");
    }
    int[] vetorB = new int[5];
    IO.println("\nDados em vetorB");
    for (int i = 0; i < vetorB.length; i++) {
      vetorB[i] = vetorA[i];
      IO.print(vetorB[i]+" ");
    }
    //System.arraycopy(vetorA,0,vetorB,0,vetorA.length);
//    for(int i:vetorB){
//      IO.print(i+" ");
//    }
  }
}
