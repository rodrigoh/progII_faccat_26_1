package aula05.exemplosVetores;

public class Exemplo03 {
  static void main() {
    int[] vetor = {1,2,3,4,5,6,7};
    int[] copia = new int[7];

    IO.println("Dados em vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }

    IO.println("\nDados em cópia: ");
    for (int i = 0; i < copia.length; i++) {
      IO.print(copia[i]+" ");
    }
    //Esse tipo de atribuição não cria uma cópia
    //copia = vetor;
    //Cópia manual de vetor
//    for (int i = 0; i < vetor.length; i++) {
//      copia[i] = vetor[i];
//    }
    //Usando o System.arraycopy(origem, posInicialOrigem, destino, posInicialDest, quantElementos)
    System.arraycopy(vetor, 0 ,copia, 0, vetor.length);

//    IO.println("\nDados em vetor: ");
//    for (int i = 0; i < vetor.length; i++) {
//      IO.print(vetor[i]+" ");
//    }
//
//    IO.println("\nDados em cópia: ");
//    for (int i = 0; i < copia.length; i++) {
//      IO.print(copia[i]+" ");
//    }

    //Teste
    copia[2] = 39;
    //posição 2 de cópia o número 39 e na posição 2 de vetor o número 3
    //ambos os vetores terão o número 39 na posição 2
    //Vai ocorrer um erro
    IO.println("\nDados em vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }

    IO.println("\nDados em cópia: ");
    for (int i = 0; i < copia.length; i++) {
      IO.print(copia[i]+" ");
    }
  }
}
