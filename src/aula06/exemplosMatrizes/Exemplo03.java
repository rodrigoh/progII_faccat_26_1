package aula06.exemplosMatrizes;

import java.util.Random;

public class Exemplo03 {
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[3][4];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c <matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(1,20);
      }
    }
    for(int[] linha:matriz) {
      for (int c : linha) {
        IO.print("%02d ".formatted(c));
      }
      IO.println();
    }
  }
}
