package aula06.exemplosMatrizes;

public class Exemplo02 {
  static void main() {
    int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15}};
    IO.println("Quantas linhas tem a matriz "+matriz.length);
    IO.println("Quantas colunas tem cada linha "+matriz[0].length);
    IO.println("Quantas colunas tem cada linha "+matriz[3].length);
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }
}
