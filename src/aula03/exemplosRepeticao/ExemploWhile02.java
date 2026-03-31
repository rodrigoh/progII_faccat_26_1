package aula03.exemplosRepeticao;

public class ExemploWhile02 {
  static void main() {
    char resp = 's';
    while(resp == 's'){
      //toLowerCase() -> devolve a String em minúsculo
      //charAt(posição) -> obtém o caractere da posição da String
      //toUppperCase() -> devolve a String em maiúscula
      resp = IO.readln("Deseja continuar (s - sim / n - não)").toLowerCase().charAt(0);
    }

    String resposta = "s";
    while(resposta.equals("s")){
      resposta = IO.readln("Deseja continuar (s - sim / n - não)").toLowerCase();
    }
  }
}
