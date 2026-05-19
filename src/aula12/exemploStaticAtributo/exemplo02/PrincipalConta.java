package aula12.exemploStaticAtributo.exemplo02;

public class PrincipalConta {
    static void main() {
        //É possível acessar um atributo estático diretamente da classe
        Conta.nomeBanco = "Banco real";

        Conta c1 = new Conta();
        c1.identificador = "a123";
        c1.saldo = 100;
        c1.mostraDados();

        Conta.nomeBanco = "Banco teste";

        c1.mostraDados();

    }
}
