package aula07.exemplos;

public class Exemplo02Opc2 {

  static double calculaMedia(double[] notas){
    double soma = 0;
    for (int i = 0; i < notas.length; i++)
      soma+=notas[i];
    return soma/notas.length;
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
    double[] notas = new double[3];
    for (int i = 0; i < notas.length; i++) {
      notas[i] = leNota(i+1);
    }
    double media = calculaMedia(notas);
    IO.println("A média do aluno vale %.2f".formatted(media));
  }
}
