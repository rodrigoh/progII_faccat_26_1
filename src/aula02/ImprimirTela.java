package aula02;

public class ImprimirTela {
  public static void main(String[] args) {
    String nome = "Jonas";
    //Variáveis do tipo número int, float, double sempre são inicializadas com zero
    int idade = 25;
    //Como para o Java todas as constantes de ponto flutuante são double
    //Precisamos realizar o casting de tipo
    //Outra opção de casting é adicionar um f ao final da constante 1.8f
    float altura = (float) 1.8;
    //Opcionalmente podemos usar sempre double
    double alturad = 1.8;

    //Imprimindo as variáveis na tela
    //sout
    System.out.println("Nome "+nome+" tem "+idade+" anos e mede "+altura);
    //%s -> String
    //%d -> inteiros
    //%f -> float ou double
    //%c -> para char apenas uma letra
    //\n -> quebrar linha
    //\t -> tabulação
    System.out.printf("Nome %s tem %d anos e mede %.2f\n",nome, idade, altura);
    //souf
    System.out.format("O método format pode ser usado como o printf\n");
    System.out.printf("\tAqui estou usando usando a tabulação");
  }
}
