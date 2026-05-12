package aula11.exemploPoo.aluno;

public class Aluno {
  String nome;
  float n1;
  float n2;
  float n3;

  Aluno(){

  }

  Aluno(String nome){
    this.nome = nome;
  }

  Aluno(String nome, float nota1, float nota2, float nota3){
    this.nome = nome;
    n1 = nota1;
    n2 = nota2;
    n3 = nota3;

  }

  float calculaMedia(){
    float media = (n1+n2+n3)/3;
    return media;
  }

  String verificaStatus(){
    float media = calculaMedia();
    if(media>=8)
      return "aprovado";
    else if(media>=3)
      return "recuperação";
    else{
      return "reprovado";
    }
  }
}
