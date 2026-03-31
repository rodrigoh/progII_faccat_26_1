package aula05.exercicios;

public class Ex15 {
  static void main() {
    int n1 = Integer.parseInt(IO.readln("Informe um valor para n1: "));
    int n2 = Integer.parseInt(IO.readln("informe um valor para n2 maior que "+n1+": "));
    while(n2<=n1){
      n2 = Integer.parseInt(IO.readln("Informe um valor para n2 maior que "+n1+": "));
    }
    int soma = n2;
    for (int i=n1;i<n2;i++){
      soma+=i;
      IO.print(i+" + ");
    }
    IO.println(n2+" = "+soma);
  }
}
