package aula08.exercicios;

import java.util.Random;

public class Ex04Opc2 {
  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6);
  }

  static void main() {
    //posição 0 = face 1
    //posição 5 = face 6
    int[] vetor = new int[6];
    //int[] vetor = {0,0,0,0,0,0};

    int lancamentos = 1_000_000;
    for (int i = 0; i < lancamentos; i++) {
      int sorteio = dado();
      vetor[sorteio]++;
    }
    for (int i = 0; i < 6; i++) {
      float percentual = vetor[i]/(float)lancamentos*100;
      IO.println("A face %d do dado saiu %d vezes o que representa %.2f %% das vezes".formatted((i+1),vetor[i],percentual));
    }
  }
}