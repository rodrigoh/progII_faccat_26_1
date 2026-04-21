package aula08.exercicios;

import java.util.Random;

/**
 * Crie um método que receba um vetor de números reais (double[]) e retorne a média aritmética dos elementos. Como desafio extra,
 * crie outro método que utilize essa média para calcular e retornar o maior valor presente no vetor.
 */
public class Ex07 {

  static double calculaMedia(double[] vetor){
    double soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }
    double media = soma/vetor.length;
    return media;
  }

  static double achaMaior(double[] vetor, double media){
    double maior=media;
    for (int i = 0; i < vetor.length; i++) {
     if(vetor[i]>maior)
        maior = vetor[i];
    }
    return maior;
  }

  static void main(String[] args) {
    Random aleatorio = new Random();
    double[] lista = new double[10];
    for (int i = 0; i < lista.length; i++) {
      lista[i] = aleatorio.nextDouble(1,50);
      IO.print("%.2f ".formatted(lista[i]));
    }
    double media = calculaMedia(lista);
    double maior = achaMaior(lista,media);
    IO.println("\nA média dos números acima é %.3f".formatted(media));
    IO.println("\nO maior valor dentre os valores acima é %.2f".formatted(maior));
  }
}
