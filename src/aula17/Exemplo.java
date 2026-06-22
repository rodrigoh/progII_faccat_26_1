package aula17;

public class Exemplo {
  static void main() {
    int i = 5;
    int j = 6;
    //Como essa linha inicia com a soma de dois inteiros
    //Ele realiza a soma e depois concatena com o " ", imprimindo 11
    IO.println(i+j+" ");
    //Diferente desta linha onde ele encontra um espaço " ", que será concatenado com
    //o i convertido para String e o j convertido para String, imprimindo 56
    IO.println(" "+i+j);
  }
}
