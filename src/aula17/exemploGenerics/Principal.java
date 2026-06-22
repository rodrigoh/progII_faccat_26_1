package aula17.exemploGenerics;

public class Principal {
  static void main() {
    Vetor<Integer> lista = new Vetor<>(10);
    lista.adiciona(1);
    lista.adiciona(3);
    lista.adiciona(4);
    IO.println(lista);
    lista.adiciona(1,2);
    IO.println(lista);
  }

}
