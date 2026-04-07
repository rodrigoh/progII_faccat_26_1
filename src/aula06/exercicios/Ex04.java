package aula06.exercicios;

/**
 * Leia números de matrículas de alunos e armazene-os em um vetor até o
 * vetor ser preenchido por 10 matrículas. Esses números são distintos,
 * ou seja, o vetor não armazenará valores repetidos. Para cada aluno
 * calcule a média de 3 notas. Armazenar a média em outro vetor.
 * Ao final mostrar cada aluno e suas respectivas notas (médias)
 */

 public class Ex04 {
  static void main() {
    int[] matriculas = new int[10];
    double[] medias = new double[10];
    //Lendo as matrículas dos alunos
    for (int i = 0; i < matriculas.length;) {
      int matricula = Integer.parseInt(IO.readln("Qual a matrícula do "+(i+1)+"° aluno: "));
      boolean achei = false;
      for (int j = 0; j < i; j++) {
        if(matriculas[j]==matricula){
          achei = true;
        }
      }
      if(!achei){
        matriculas[i] = matricula;
        i++;
      }
      else{
        IO.println("Matricula "+matricula+" já cadastrada");
      }
    }
    IO.println("Para cada aluno informe as notas das três avaliações");
    for (int i = 0; i < matriculas.length; i++) {
      IO.println("Aluno "+matriculas[i]);
      double soma = 0;
      for (int j = 1; j < 4; j++) {
        double nota = Double.parseDouble(IO.readln("Qual a "+j+"° nota: "));
        soma +=nota;
      }
      medias[i] = soma/3;
    }
    for (int i = 0; i < matriculas.length; i++) {
      IO.println("Aluno %s tem média %.2f".formatted(matriculas[i],medias[i]));
    }

  }
}
