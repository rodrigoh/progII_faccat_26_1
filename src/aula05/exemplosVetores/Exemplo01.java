package aula05.exemplosVetores;

public class Exemplo01 {
  static void main() {
    //int vetor[10];
    //Vetor com capacidade para 10 elementos
    //Posições iam de 0 a 9
    //tipo[] nome = new tipo[capacidade]
    int tamanho = 10;
    int[] vetor = new int[tamanho];
    //opcionalmente int vetor[] = new int[tamanho];
    //Sempre necessário usar um endereço específico
    //vetor[5] = 6;
    //Não é possível olhar para todo o vetor de uma vez, precisamos olhar posição por posição
    //IO.println(vetor);
    for (int i = 0; i < 10; i++) {
      vetor[i] = Integer.parseInt(IO.readln("vetor["+i+"]: "));
    }
    IO.println("Dados no vetor...");
    for (int i = 0; i < 10; i++) {
      IO.print(vetor[i]+" ");
    }
    //Descobrindo o tamanho de um vetor
    //int tamanho = sizeof(vetor)/sizeof(int)
    int tamanhoVet = vetor.length;
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
  }
}
