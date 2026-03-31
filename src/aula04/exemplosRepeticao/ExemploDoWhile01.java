package aula04.exemplosRepeticao;

public class ExemploDoWhile01 {
  static void main() {
    int valor = 10;
    while(valor<10){
      IO.print(valor+" ");
      valor++;
    }
    //faça...enquanto
    do{
      IO.print(valor+" ");
      valor++;
    }
    while(valor<10);
  }
}
