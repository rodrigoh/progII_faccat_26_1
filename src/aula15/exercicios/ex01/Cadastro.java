package aula15.exercicios.ex01;

public class Cadastro {
    static void main() {
        Aluno a1 = new Aluno();
        a1.setNome("Jonas");
        a1.setCurso("Informática");
        IO.println(a1);
        //a1.mostraDados();
        Aluno a2 = new Aluno();
        a2.setNome("Ana");
        a2.setCurso("Informática");
        IO.println(a2);
        //Acesso ao método estático que mostra a quantidade de alunos
        IO.println(Aluno.obterQuantidadeAluno());
    }
}
