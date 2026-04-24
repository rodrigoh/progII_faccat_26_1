package aula07.revisao;

public class Ex10 {
  static int[][] calculaTransposta(int[][] matriz){
    //O que era linha vira coluna e o que era coluna vira linha
    int[][] matrizT = new int[matriz[0].length][matriz.length];
    for (int l = 0; l < matrizT.length; l++) {
      for (int c = 0; c < matrizT[l].length; c++) {
        matrizT[l][c] = matriz[c][l];
      }
    }
    return matrizT;
  }

  static void mostraMatriz(int[][] matriz){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }

  static void main() {
    int[][] matriz = {{1,5},{7,3},{5,2}};
    IO.println("Matriz original");
    mostraMatriz(matriz);
    IO.println("Matriz transposta");
    int[][] transposta = calculaTransposta(matriz);
    mostraMatriz(transposta);
  }

}
