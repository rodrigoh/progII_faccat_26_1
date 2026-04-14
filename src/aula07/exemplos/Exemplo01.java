package aula07.exemplos;

public class Exemplo01 {
  //tipo_acesso tipo_retorno nome(tipo_paramentro nome_parametro)
  static int somaNumero(int n1, int n2){
    return n1+n2;
  }

  static int leNumero(String mensagem){
    return Integer.parseInt(IO.readln(mensagem+": "));
  }

  static void main() {
    //int num1 = Integer.parseInt(IO.readln("Informe um número: "));
    //int num2 = Integer.parseInt(IO.readln("Informa outro número: "));
    int num1 = leNumero("Digite o primeiro número");
    int num2 = leNumero("Digite o segundo número");

    int soma = somaNumero(num1, num2);
    IO.println(num1+"+"+num2+"="+soma);
  }
}
