package aula12.modificadoresAcesso.model;

public class Aluno {

    Pessoa pessoa = new Pessoa();

    Aluno(){
        //como nome é protected em Pessoa, ele pode ser acessado por outra classe dentro do mesmo pacote
        pessoa.nome = "Ana";
        //O mesmo vale para idade, que está sem modificador
        pessoa.idade = 25;
        //O sobrenome não pode ser acessado diretamente porque é privado e só é visível para classe Pessoa
        //pessoa.sobrenome = "Silva";
        //O e-mail é acessível de qualquer lugar já que é public
        pessoa.mail = "ana@gmail.com";

    }
}
