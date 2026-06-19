package aula16.exercicio03;

public class Principal {
  static void main() {
    Vetor v1 = new Vetor(10);
    v1.adiciona("a");
    v1.adiciona("c");
    v1.adiciona("d");
    v1.adiciona("e");
    v1.adiciona("f");
    IO.println(v1);
    v1.adiciona(1,"b");
    IO.println(v1);
    v1.remove(1);
    IO.println(v1);
  }
}
