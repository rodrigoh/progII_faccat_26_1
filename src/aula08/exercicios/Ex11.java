package aula08.exercicios;

public class Ex11 {
  static void ordenaVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      for (int j = 0; j < vetor.length-1; j++) {
        if(vetor[j]>vetor[j+1]){
          int aux = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = aux;
        }
      }
    }
  }

  static void main() {
    int[] vetor = {12,3,6,1,8,7};
    IO.println("Dados desordenados");
    for(int i:vetor){
      IO.print(i+" ");
    }
    ordenaVetor(vetor);
    IO.println("\nDados ordenados");
    for(int i:vetor){
      IO.print(i+" ");
    }
  }
}
