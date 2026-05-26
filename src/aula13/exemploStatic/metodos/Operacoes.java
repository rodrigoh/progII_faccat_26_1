package aula13.exemploStatic.metodos;

import java.util.function.DoubleUnaryOperator;

public class Operacoes {
  //Quando um método é estático, ele existe independente da criação
  //de instâncias
  //portanto pode ser chamado diretamente da classe
  public static double leDouble(String mensagem){
    return Double.parseDouble(IO.readln(mensagem+": "));
  }

  public static double mediaElementos(double[] lista){
    double soma = 0;
    for (int i = 0; i < lista.length; i++) {
      soma+=lista[i];
    }
    return soma/lista.length;
  }

  public static double power(double base, double expoente){
    double mult = 1;
    for (int i = 0; i < expoente; i++) {
      mult*=base;
    }
    return mult;
  }
}
