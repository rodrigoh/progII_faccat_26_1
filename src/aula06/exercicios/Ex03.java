package aula06.exercicios;

import java.util.Random;

/**
 * Declare três vetores com até 100 números, o primeiro deve receber números aleatórios,
 * o segundo deve receber os números pares do primeiro vetor e o terceiro os números ímpares
 * do primeiro vetor. Ao final mostrar os três vetores
 */
public class Ex03 {
  static void main() {
    Random aleatorio = new Random();
    int[] va = new int[100];
    int[] vp = new int[100];
    int[] vi = new int[100];
    int ip = 0;
    int ii = 0;
    IO.println("Dados em vetor: ");
    for (int i = 0; i < va.length; i++) {
      va[i] = aleatorio.nextInt(1, 200);
      IO.print(va[i]+" ");
      //Classificando
      if(va[i]%2==0){
        vp[ip] = va[i];
        ip++;
        //ip+=1;
        //ip = ip +1;
      }
      else{
        vi[ii] = va[i];
        ii++;
      }

      }
    IO.println("\nDos números acima são pares: ");
    for (int i=0;i<ip;i++){
      IO.print(vp[i]+" ");
    }
    IO.println("\nE ímpares: ");
    for(int i=0;i<ii;i++){
      IO.print(vi[i]+" ");
    }
  }
}
