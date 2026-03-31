package aula04.exemplosSelecao;

public class ExemploSwitch01 {
  static void main() {
    int dia = Integer.parseInt(IO.readln("Digite um dia da semana: "));
    //Sintaxe legada
    switch (dia){
      case 2,3,4,5,6:
        IO.println("É dia útil");
        break;
      case 1,7:
        IO.println("É fim de semana");
        break;
      default:
        IO.println("O número "+dia+" não corresponde a nenhum dia");
    }
    //Sintaxe java 17+
    switch (dia){
      case 2,3,4,5-> IO.println("É dia útil");
      case 1,7-> {
        IO.println("É fim de semana");
        IO.println("outra linha");
      }
      default -> IO.println("O número "+dia+" não corresponde a nenhum dia");
    }
    //O pirmeiro case traduzido para if...
    if(dia==2 || dia==3 || dia==4 || dia==5 || dia==6)
      IO.println("É dia útil");
    if(dia>=2 && dia <=6)
      IO.println("É dia útil");
  }
}
