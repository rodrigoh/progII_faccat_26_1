package aula05.exercicios;

public class Ex16 {
  static void main() {
    int base = Integer.parseInt(IO.readln("Digite o valor da base: "));
    int expoente = Integer.parseInt(IO.readln("Digite o valor do expoente: "));
    IO.println(Math.pow(base, expoente));
    int res = 1;
    for(int i=0;i<expoente;i++){
      res*=base;
    }
    IO.println(base+"^"+expoente+" = "+res);

//    for (int i = 0; i < 10; i++) {
//      IO.print(i+" ");
//    }
//    IO.println();
//    for (int i = 1; i <= 10; i++) {
//      IO.print(i+" ");
//    }
  }
}
