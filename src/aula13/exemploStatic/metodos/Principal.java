package aula13.exemploStatic.metodos;

public class Principal {
  static void main() {
    //Podemos chamar os métodos estáticos diretamente da classe
    double base = Operacoes.leDouble("Qual o valor da base");
    double expoente = Operacoes.leDouble("Qual o expoente");
    double resultado = Operacoes.power(base,expoente);
    IO.println("%.2f ^ %.2f = %.2f".formatted(base,expoente,resultado));
  }
}
