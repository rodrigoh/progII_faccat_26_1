package aula08.exercicios;

import java.util.Random;

public class Ex04 {
  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6)+1;
  }

  static void main() {
    int l1 = 0;
    int l2 = 0;
    int l3 = 0;
    int l4 = 0;
    int l5 = 0;
    int l6 = 0;
    //
    float pl1 = 0;
    float pl2 = 0;
    float pl3 = 0;
    float pl4 = 0;
    float pl5 = 0;
    float pl6 = 0;
    //
    int lancamentos = 1_000_000;
    for (int i = 0; i < lancamentos; i++) {
      int sorteio = dado();
      switch (sorteio){
        case 1->l1++;
        case 2->l2++;
        case 3->l3++;
        case 4->l4++;
        case 5->l5++;
        case 6->l6++;
      }
    }
    pl1 = l1/(float) lancamentos*100;
    pl2 = l2/(float) lancamentos*100;
    pl3 = l3/(float) lancamentos*100;
    pl4 = l4/(float) lancamentos*100;
    pl5 = l5/(float) lancamentos*100;
    pl6 = l6/(float) lancamentos*100;
    IO.println("A face 1 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l1,pl1));
    IO.println("A face 2 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l2,pl2));
    IO.println("A face 3 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l3,pl3));
    IO.println("A face 4 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l4,pl4));
    IO.println("A face 5 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l5,pl5));
    IO.println("A face 6 do dado saiu %d vezes o que representa %.2f %% das vezes".formatted(l6,pl6));
  }
}
