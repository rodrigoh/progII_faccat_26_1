package aula04.exemplosRepeticao;

public class ExemplosFor {
  static void main() {
    //for(inicialização; condição de fim; passo ou incremento)
    for (int i = 0; i < 10; i++) {
      IO.print(i+" ");
    }
    //For sem inicialização
    IO.println("\nExemplo 02, sem inicialização");
    int j = 10;
    for(;j>=0;j--)
      IO.print(j+" ");
    //For sem incremento
    IO.println("\nExemplo 03, sem incremento");
    for (int i = 0; i <20;) {
      i++;
      IO.print(i+" ");
    }
    IO.println("\nExemplo 04, for com mais de um contador");
    //For com mais de um contador
    for(int i=0,t=9;i<10 && t>=0;i++,t--){
      IO.println("i = "+i+" t = "+t);
    }
    IO.println("\nExemplo 05, perguntando para o usuário");
    for(char resposta = 's'; resposta=='s';){
      IO.println("Executando alguma coisa...");
      resposta = IO.readln("Continuar - s ou parar - n: ").toLowerCase().charAt(0);
    }
  }
}
