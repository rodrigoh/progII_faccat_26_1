package aula08.exercicios;

import java.util.Scanner;

//Crie um método que receba 3 números e retorne o menor valor
public class Ex02 {

  static int achaMenor(int a, int b, int c){
    int menor;
    if(a < b && a < c)
      menor =  a;
    else if(b < a && b < c)
      menor = b;
    else
      menor = c;
    return menor;
  }

  static void main() {
    Scanner ler = new Scanner(System.in);
    System.out.print("a: ");
    int a = ler.nextInt();
    System.out.print("b: ");
    int b = ler.nextInt();
    System.out.print("c: ");
    int c = ler.nextInt();
    //System.out.println("O menor número é "+achaMenor(a,b,c));
    int menor = achaMenor(a,b,c);
    System.out.println("O menor número é "+menor);
  }
}
