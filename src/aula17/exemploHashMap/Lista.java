package aula17.exemploHashMap;

import java.util.HashMap;

public class Lista {
  static void main() {
    HashMap<Integer, String> chaveValor = new HashMap<>();

    chaveValor.put(1,"Arroz");
    chaveValor.put(2,"Café");
    IO.println(chaveValor);
    chaveValor.put(3,"Arroz");
    chaveValor.put(1,"Feijão");
    IO.println(chaveValor);
    IO.println(chaveValor.get(1));
    IO.println("Iterando as chaves\n");
    for(Integer chave: chaveValor.keySet()){
      IO.print(chave+" ");
    }
    IO.println("\n\nIterando os valores\n");
    for(String valor:chaveValor.values()){
      IO.print(valor+" ");
    }
  }
}
