package aula17.exemploHashSet;

import java.util.HashSet;

public class ListaCompras {
  static void main() {
    //Não permite duplicidade de elementos
    //Só podem ser adicionados elementos no final
    HashSet<String> compras = new HashSet<>(10);
    IO.println("Adicionando arroz a lista: "+compras.add("arroz"));
    IO.println("Adicionando café a lista: "+compras.add("café"));
    IO.println("Adicionando feijão a lista: "+compras.add("feijão"));
    IO.println("Adicionando arroz a lista: "+compras.add("arroz"));
    IO.println(compras);
    compras.remove("feijão");
    IO.println(compras);

  }
}
