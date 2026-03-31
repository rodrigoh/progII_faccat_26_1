package aula05.exemplosVetores;

import java.util.Random;

public class Exercicio01 {
  static void main() {
    Random aleatorio = new Random();
    int[] va = new int[5];
    int[] vb = new int[5];
    //Gerando valores para o va
    IO.println("Dados em va");
    for (int i = 0; i < va.length; i++) {
      va[i] = aleatorio.nextInt(20);
      IO.print(va[i]+" ");
    }
    //usando o System.arraycopy
    //System.arraycopy(va, 0, vb, 0, va.length);
    //Copiando os elementos
    IO.println("\nDados em vb");
    for (int i = 0; i < va.length; i++) {
      vb[i] = va[i];
      IO.print(vb[i]+" ");
    }
  }
}
