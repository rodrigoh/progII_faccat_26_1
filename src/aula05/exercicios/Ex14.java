package aula05.exercicios;

public class Ex14 {
  static void main() {
    int n = Integer.parseInt(IO.readln("Digite um número: "));
    int soma = n;
    for (int i = 1; i < n; i++) {
      soma+=i;
      IO.print(i+" + ");
      //soma = soma + i;
    }
    IO.println(n+" = "+soma);
    //IO.println("A soma dos números entre 1 e "+n+" vale "+soma);
  }
}
