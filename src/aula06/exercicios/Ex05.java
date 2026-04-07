package aula06.exercicios;

/**
 * Dado o vetor {18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13},
 * crie um programa que ordene essa lista, ele deve funcionar para qualquer vetor. Mostre o
 * vetor ordenado.
 */
public class Ex05 {
  static void main() {
    int[] vetor = {18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13};
    IO.println("Dados a serem ordenados...");
    for(int i=0;i<vetor.length;i++){
      IO.print(vetor[i]+" ");
    }
    for (int i = 0; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length-1; j++) {
        if(vetor[j]>vetor[j+1]){
          int aux = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = aux;
        }
      }
    }
    IO.println("\nDados ordenados...");
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
  }
}
