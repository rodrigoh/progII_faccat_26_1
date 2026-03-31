package aula04.exemplosSelecao;

public class ExemploSelecao01 {
  static void main() {
    int numero = Integer.parseInt(IO.readln("Digite um número != de zero"));
    //(teste ? resultado_verdadeiro : resultado_falso)
    IO.println("O numero "+numero+" é "+(numero>0 ? "positivo" : "negativo"));
  }
}
