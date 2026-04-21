package aula08.exercicios;

import java.util.Random;

public class Ex03 {
  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(6)+1;
  }

  static void main() {
    for (int i = 0; i < 10; i++) {
      IO.print(dado()+" ");
    }
  }
}
