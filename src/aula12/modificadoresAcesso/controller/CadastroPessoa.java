package aula12.modificadoresAcesso.controller;

import aula12.modificadoresAcesso.model.Pessoa;

public class CadastroPessoa {
    static void main() {
        Pessoa p1 = new Pessoa();
        //Neste exemplo Pessoa em relação a CadastroPessoa está no "mundo", já que estão no mesmo projeto, porém em pacotes diferentes
        //Podemos acessar o atributo e-mail por ser público
        //p1.mail = "ana@gmail.com";
        //nome (protected) não pode acessado
        //p1.nome = "Ana";
        //idade (sem modificador) não pode ser acessado
        //p1.idade = 30;
    }

}
