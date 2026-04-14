package aula07.exemplos;

import java.util.Random;

public class Exemplo03 {

  static void multiplicaVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      vetor[i]*=2;
    }
  }

  static void mostraVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i] + " ");
    }
  }

  //Ele retorna um vetor com tamanho número aleatórios
  static int[] geraVetorAleatorio(int tamanho){
    Random aleatorio = new Random();
    int[] vetor = new int[tamanho];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(1,tamanho*2);
    }
    return vetor;
  }

  static void main() {
    int t = Integer.parseInt(IO.readln("Qual o tamanho do vetor: "));
    //Gerou um vetor aleatório usando um médodo
    int[] vetor = geraVetorAleatorio(t);
    //Mostrar o vetor na tela
    mostraVetor(vetor);
    //Multiplicando o vetor por 2
    multiplicaVetor(vetor);
    IO.println("\nO dobro do vetor");
    //Mostrar o vetor na tela
    mostraVetor(vetor);


  }
}
