package aula14.exemploPolimorfismo.exOverload;

public class Operacoes {
  /*
  Quando estamos usando Overload (sobrecarga), os métodos precisam ter quantidade de parâmetros
  ou tipos diferentes.
   */
  public int soma(int n1, int n2){
    return n1+n2;
  }

  public int soma(int n1, int n2, int n3){
    return n1+n2+n3;
  }

  public int soma(int[] vetor){
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma+=vetor[i];
    }
    return soma;
  }

  public String soma(String s1, String s2){
    return s1+" "+s2;
  }
}
