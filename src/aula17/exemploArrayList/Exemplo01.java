package aula17.exemploArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
  static void main() {
    List<Pessoa> lista = new ArrayList<>(5);
    lista.add(new Pessoa("Jonas","Silva",1));
    lista.add(new Pessoa("Ana","Souza",2));
    IO.println(lista);


  }
}
