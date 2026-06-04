package aula14.exemploPolimorfismo.exOverload;

public class Principal {
  static void main() {
    Operacoes op = new Operacoes();

    int resultado = op.soma(5,6);
    IO.println(resultado);

    int[] lista = {1,2,3,4,5};
    resultado = op.soma(lista);
    IO.println(resultado);

    IO.println(op.soma("Jonas","Silva"));
  }
}
