package aula06.exercicios;

public class Ex06 {
  static void main() {
    int tamanho = Integer.parseInt(IO.readln("Qual deve ser o tamanho dos vetores: "));
    int[] va = new int[tamanho];
    int[] vb = new int[tamanho];
    IO.println("Lendo dados para VA");
    for (int i = 0; i < va.length; i++) {
      va[i] = Integer.parseInt(IO.readln("va["+i+"]: "));
    }
    IO.println("Lendo dados para VB");
    for (int i = 0; i < vb.length; i++) {
      vb[i] = Integer.parseInt(IO.readln("vb["+i+"]: "));
    }
    boolean ePermutacao = true;
    for (int i = 0; i < va.length && ePermutacao; i++) {
      boolean achei = false;
      for (int j = 0; j < vb.length; j++) {
        if(va[i]==vb[j]){
          achei = true;
        }
      }
      if(!achei){
        ePermutacao = false;
      }
    }
    IO.println("Os vetores Va e Vb são permutação "+(ePermutacao?"Sim":"Não"));
//    if(ePermutacao){
//      IO.println("Os vetores Va e Vb são permutação");
//    }
//    else{
//      IO.println("Os vetores Va e Vb não são permutação");
//    }

  }
}
