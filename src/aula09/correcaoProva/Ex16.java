package aula09.correcaoProva;

public class Ex16 {
  static int[][] calculaTransposta(int[][] matriz){
    int[][] mt = new int[matriz[0].length][matriz.length];
    for (int l = 0; l < mt.length; l++) {
      for (int c = 0; c < mt[0].length;c++){
        mt[l][c] = matriz[c][l];
      }
    }
    return mt;
  }

  static void mostraMatriz(int[][] matriz){
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[0].length; c++) {
        IO.print(matriz[l][c]+" ");
      }
      IO.println();
    }
  }

  static void main() {
    int[][] matriz = {{1,5},{7,3},{8,2}};
    mostraMatriz(matriz);
    mostraMatriz(calculaTransposta(matriz));
  }
}
