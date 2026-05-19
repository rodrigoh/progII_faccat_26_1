package aula12.modificadoresAcesso.pratica03.app;

import aula12.modificadoresAcesso.pratica03.model.Funcionario;

public class Principal {
    static void main() {
        /*
        public String nome;
        protected String setor;
        private float salario;
        //Aqui estamos com a regra do sem modificador
        int idade;
        */
        Funcionario funcionario01 = new Funcionario();
        //Nome pode ser acessado porque é public
        funcionario01.nome = "Jonas";
        //O atributo setor por ser protected e a relação entre a classe Principal e Funcionario é de mundo, o atributo fica oculto
        //funcionario01.setor = "TI";
        //O atributo salario não pode ser acessado por ser private, que é o mais restritivo dos modificadores
        //funcionario01.salario = 10_000;
        //A idade só poderia ser acessada no mesmo pacote, ou seja se a classe Funcionario e Principal estivessem no mesmo Pacote
        //funcionario01.idade = 30;

    }
}
