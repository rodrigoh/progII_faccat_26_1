package aula12.modificadoresAcesso.pratica03.model;

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
        //Aqui podemos acessar os atributos protegidos porque Principal e Funcionario estão no mesmo pacote
        funcionario01.setor = "TI";
        //O atributo salario não pode ser acessado por ser private, que é o mais restritivo dos modificadores
        //funcionario01.salario = 10_000;
        //Como estão no mesmo pacote posso acessar a idade também.
        funcionario01.idade = 30;

    }
}
