package aula15.exercicios.ex01;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private static int contAluno;

    public Aluno(){
        contAluno++;
        matricula = 1000+contAluno;
    }

    public void setNome(String nome){
        if(nome.length()>=2)
            this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCurso(String curso){
        if(curso.length()>=3)
            this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

    public int getMatricula(){
        return matricula;
    }

    public static int obterQuantidadeAluno(){
        return contAluno;
    }

    @Override
    public String toString(){
        String dados = "Matrícula: "+matricula;
        dados+="\nNome: "+nome;
        dados+="\nCurso: "+curso;
        return dados;
    }

    public void mostraDados(){
        IO.println(toString());
    }
}
