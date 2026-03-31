package aula05.exemplosVetores;

public class Exemplo02 {
  static void main() {
    //Posso declarar e inicializar um vetor com determinado conteúdo
    int[] vetor = {1,2,3,4,5,6,7};
    String[] palavras = {"Computador", "mesa", "monitor", "Teclado", "mouse"};
    //Imprimir os vetores
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
    IO.println("\nVetor de palavras");
    for (int i = 0; i < palavras.length; i++) {
      IO.print(palavras[i]+" ");
    }
    //Usando o for each
    IO.println("\nUsando o for each");
    for(int valor : vetor){
      IO.print(valor+" ");
    }
    IO.println("\nPara um vetor de Strings");
    for(String palavra : palavras){
      IO.print(palavra+" ");
    }

  }
}
