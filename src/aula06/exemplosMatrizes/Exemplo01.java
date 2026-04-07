package aula06.exemplosMatrizes;

public class Exemplo01 {
  static void main() {
    //tipo[][] nome = new int[quantLinhas][quantColunas]
    int[][] matriz = new int[3][4];
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 4; c++) {
        matriz[l][c] = Integer.parseInt(IO.readln("matriz["+l+"]["+c+"]: "));
      }
    }
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 4; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }
}
