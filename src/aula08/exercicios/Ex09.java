package aula08.exercicios;

import java.util.Random;

/**
 * Localizar Maior Valor: Escreva um método que receba uma matriz de inteiros e imprima a linha e a coluna onde se encontra o maior valor contido nela.
 */
public class Ex09 {
  static void achaMaior(int[][] matriz){
    int maior = matriz[0][0];
    int linha = 0;
    int coluna = 0;
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(matriz[l][c]>maior) {
          maior = matriz[l][c];
          linha = l;
          coluna = c;
        }
      }
    }
    IO.println("O maior número na matriz é %d e está na linha %d e coluna %d".formatted(maior,linha,coluna));
  }

  static String mostraMatriz(int[][] matriz) {
    String retorno = "";
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        retorno += "%02d ".formatted(matriz[l][c]);
      }
      retorno += "\n";
    }
    return retorno;
  }

  static void geraMatriz(int[][] matriz){
    Random aleatorio = new Random();
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,100);
      }
    }
  }

  static void main() {
    int[][] matrizD = new int[4][5];
    geraMatriz(matrizD);
    String impressao = mostraMatriz(matrizD);
    IO.println(impressao);
    achaMaior(matrizD);
  }

}
