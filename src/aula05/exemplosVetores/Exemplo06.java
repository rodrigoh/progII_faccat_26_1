package aula05.exemplosVetores;

public class Exemplo06 {
  static void main() {
    //Quando uso um vetor de objetos o Java não inicializa as posições como nos vetores de números, elas ficam nulas
    String[] lista = new String[5];
    for(String item: lista)
      IO.print(item+" ");
  }
}
