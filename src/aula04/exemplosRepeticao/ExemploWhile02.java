package aula04.exemplosRepeticao;

public class ExemploWhile02 {
  static void main() {
    char resposta = 's';
    //enquanto...faça
    while(resposta=='s'){
      IO.println("Executando alguma coisa...");
      resposta = IO.readln("Continuar (s - sim / n - não): ").toLowerCase().charAt(0);
    }
  }
}
