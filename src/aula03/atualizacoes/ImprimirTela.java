package aula03.atualizacoes;

public class ImprimirTela {
  static void main() {
    //Mostrando mensagens na tela
    IO.println("Mensagem a ser mostrada na tela");
    //Equivalente a
    System.out.println("Mensagem a ser mostrada na tela");
    //Mostrando o conteúdo de variáveis na tela
    String nome = "Jonas";
    int idade = 20;
    float altura = 1.8f;
    //Equivale a
    //float altura = (float) 1.8;
    IO.println("Nome: "+nome+" tem "+idade+" anos e mede "+altura);
    IO.println("Nome: %s tem %d anos e mede %.2f metros".formatted(nome,idade,altura));
    //Equivale a
    System.out.printf("Nome: %s tem %d anos e mede %.2f metros\n",nome,idade,altura);
    //Formatando float
    IO.println("O valor de PI é "+String.format("%.2f",Math.PI));
    IO.println("O valor de PI é %.2f".formatted(Math.PI));
  }
}
