package aula11.exemploPoo.aluno;

public class Principal {
  static void main() {
    String nome = IO.readln("Qual o nome do aluno: ");
    Aluno a1 = new Aluno(nome);
    //a1.nome = IO.readln("Qual o nome do aluno: ");
    a1.n1 = Float.parseFloat(IO.readln("Qual a primeira nota do "+a1.nome+": "));
    a1.n2 = Float.parseFloat(IO.readln("Qual a segunda nota do "+a1.nome+": "));
    a1.n3 = Float.parseFloat(IO.readln("Qual a terceira nota do "+a1.nome+": "));

    float media = a1.calculaMedia();

    IO.println("O aluno "+a1.nome+" tem média "+media+" e está "+a1.verificaStatus());

    Aluno a2 = new Aluno();
    Aluno a3 = new Aluno("Jonas",8,9,10);
    Aluno a4 = new Aluno("Ana");

    Aluno[] lista = new Aluno[10];
    lista[0] = new Aluno();
  }
}
