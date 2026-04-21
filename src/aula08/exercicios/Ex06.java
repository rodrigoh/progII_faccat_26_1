package aula08.exercicios;
//Faça um programa em que acha todos os números primos até 1000. Número primo é aquele que é divisível somente por 1 e por ele mesmo.
public class Ex06 {
  static boolean ePrimo(int numero){
    int contDiv = 0;
    for (int i = 1; i <= numero; i++)
      if(numero%i==0)
        contDiv++;
//    if(contDiv==2)
//      return true;
//    else
//      return false;
    return contDiv==2;
  }

  static void main() {
    for (int i = 1; i <= 1000_000; i++) {
      if(ePrimo(i))
        IO.print(i+" ");
    }
  }
}
