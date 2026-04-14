package aula07.exemplos;

/**
 * Crie um programa que tenha um método para calcular a média de um
 * aluno que tenha 3 notas. Devolver o resultado para o método principal
 * e mostrar na tela.
 */
public class Exemplo02 {

  //Médodo que calcula a média de três
  static double calculaMedia(double notaUm, double notaDois, double notaTres){
    return (notaUm+notaDois+notaTres)/3;
  }

  static double leNota(int contador){
    double nota = Double.parseDouble(IO.readln("Digite a "+contador+"° nota: "));
    while(nota<0 || nota>10){
      IO.println("Nota "+nota+" é inválida, digite outra!");
      nota = Double.parseDouble(IO.readln("Digite a "+contador+"° nota: "));
    }
    return nota;
  }

  static void main() {
    double n1 = leNota(1);
    double n2 = leNota(2);
    double n3 = leNota(3);
    double media = calculaMedia(n1,n2,n3);
    IO.println("A média do aluno é %.2f".formatted(media));
  }
}
