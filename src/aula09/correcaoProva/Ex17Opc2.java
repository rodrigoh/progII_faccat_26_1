package aula09.correcaoProva;

import java.util.Random;
import java.util.Scanner;

public class Ex17Opc2 {
  static void main() {
    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();
    int tam = 10;
    int[] vetor = new int[tam];
    for (int i = 0; i < tam; i++) {
      vetor[i] = aleatorio.nextInt(1,20);
      IO.print(vetor[i]+" ");
    }
    IO.print("\nQual número remover: ");
    int remove = ler.nextInt();
    for (int i = 0; i < tam; i++) {
      if(vetor[i]==remove){
        tam--;
        for (int j = i; j < tam; j++) {
          vetor[j] = vetor[j+1];
        }
      }
    }

    for (int i = 0; i < tam; i++) {
      IO.print(vetor[i]+" ");
    }
  }

}
