package aula04.exemplosRepeticao;

public class ExemploDoWhile02 {
  static void main() {
    char resposta;
    do{
      IO.println("Executando alguma coisa...");
      resposta = IO.readln("S - continuar / n - parar)").toLowerCase().charAt(0);
    }
    while (resposta=='s');
  }
}
