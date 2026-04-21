package aula08.exercicios;
/*
Desenvolva um método chamado posicaoDoElemento que receba um vetor de inteiros e um valor alvo. O método deve retornar o índice (posição)
da primeira ocorrência desse valor no vetor. Caso o valor não exista, retorne -1.
 */
public class Ex08 {
  //1,2,3,4,2
  //elemento = 2
//  static int posicaoDoElemento(int[] lista, int elemento){
//    int posicao = -1;
//    for (int i = 0; i < lista.length && posicao==-1; i++) {
//      if(lista[i]==elemento){
//        posicao = i;
//      }
//    }
//    return posicao;
//  }

  static int posicaoDoElemento(int[] lista, int elemento){
    for (int i = 0; i < lista.length; i++) {
      if(lista[i]==elemento){
        return i;
      }
    }
    return -1;
  }

  static void main() {
    int[] vetor = {1,2,3,4,2};
    int posicao = posicaoDoElemento(vetor,2);
    if(posicao>=0)
      IO.println("A posição da primeira ocorrência do número 2 na lista é "+posicao);
    else
      IO.println("O elemento 2 não existe na lista");
    posicao = posicaoDoElemento(vetor,0);
    if(posicao>=0)
      IO.println("A posição da primeira ocorrência do número 0 na lista é "+posicao);
    else
      IO.println("O elemento 0 não existe na lista");
  }
}
