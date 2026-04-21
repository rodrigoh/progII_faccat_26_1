package aula08.exercicios;

import java.util.Random;

/**
 * Filtro de Primos no Vetor: Utilizando o conceito do exercício 6 da sua lista original, crie um método que receba um vetor de números
 * aleatórios e retorne um novo vetor contendo apenas os números que são primos.
 */
public class Ex10 {

  static boolean ePrimo(int numero){
    int contDiv = 0;
    for (int i = 1; i <= numero; i++)
      if(numero%i==0)
        contDiv++;
    return contDiv==2;
  }

  static int[] geraVetor(int tamanho){
    Random aleatorio = new Random();
    int[] vetor = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      vetor[i] = aleatorio.nextInt(1,tamanho*2);
    }
    return vetor;
  }

  static void mostraVetor(int[] vetor, int quantidade){
    for (int i = 0; i < quantidade; i++) {
      IO.print(vetor[i]+" ");
    }
  }

  static void main() {
    int tamanho = Integer.parseInt(IO.readln("Qual deve ser o tamanho do vetor: "));
    int[] elementos = geraVetor(tamanho);
    IO.println("Dados no vetor");
    mostraVetor(elementos,tamanho);

    int[] primos = new int[tamanho];
    int cp = 0;
    for (int i = 0; i < elementos.length; i++) {
      if(ePrimo(elementos[i])){
        primos[cp] = elementos[i];
        cp++;
      }
    }
    IO.println("\nSão primos os");
    mostraVetor(primos,cp);
  }
}
