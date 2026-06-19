package aula16.exemploArrayList;

import java.util.ArrayList;

public class Exemplo01 {
  static void main() {
    //Aqui precisamos usar Objetos Integer, String, Double, Float, Pessoa, Conta...
    ArrayList<String> lista = new ArrayList<>(3);
    //Adicionando
    lista.add("A");
    lista.add("C");
    lista.add("D");
    lista.add("E");
    lista.add("F");
    IO.println(lista);
    lista.add(1,"B");
    IO.println(lista);
    IO.println(lista.get(2));
    IO.println(lista.remove(2));
    IO.println(lista);
    IO.println(lista.remove("E"));
    IO.println(lista);
    IO.println(lista.size());

    //lista.add("A");
    lista.add("C");
    lista.add("D");
    lista.add("E");
    lista.add("F");

    IO.println("A posição do elemento 'A' na lista é "+lista.indexOf("A"));
    IO.println("A última posição do elemento 'A' na lista é "+lista.lastIndexOf("A"));
    IO.println("A lista contém um elemento 'J' "+lista.contains("J"));
  }
}
