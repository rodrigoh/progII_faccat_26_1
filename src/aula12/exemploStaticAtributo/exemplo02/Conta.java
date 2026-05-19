package aula12.exemploStaticAtributo.exemplo02;

public class Conta {
    String identificador;
    //Nome banco existe para a classe
    //É único para todas as instâncias
    static String nomeBanco;
    float  saldo;

    void mostraDados(){
        IO.println("Identificador: "+identificador);
        IO.println("Nome banco: "+nomeBanco);
        IO.println("Seu saldo é de %.2f".formatted(saldo));
    }
}
