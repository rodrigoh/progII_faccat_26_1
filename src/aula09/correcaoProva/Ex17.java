package aula09.correcaoProva;

import java.util.Random;
import java.util.Scanner;

public class Ex17 {
  static void main() {
    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();
    int tam = 10;
    int[] vetor = new int[tam];
    for (int i = 0; i < tam; i++) {
      vetor[i] = aleatorio.nextInt(1,50);
      IO.print(vetor[i]+" ");
    }
    IO.print("\nQual número remover: ");
    int remove = ler.nextInt();
    int posicao = -1;
    for (int i = 0; i < tam; i++) {
      if(vetor[i]==remove){
        posicao = i;
      }
    }
    if(posicao!=-1){
      tam--;
      for (int i = posicao; i < tam; i++) {
        vetor[i] = vetor[i+1];
      }
      for (int i = 0; i < tam; i++) {
        IO.print(vetor[i]+" ");
      }
    }
    else{
      IO.println("Número não está no vetor");
    }
  }

}
