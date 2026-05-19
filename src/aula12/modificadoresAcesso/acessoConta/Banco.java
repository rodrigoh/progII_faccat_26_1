package aula12.modificadoresAcesso.acessoConta;

public class Banco {
    static void main() {
        Conta c1 = new Conta("Jonas");
        //O identificador da conta não pode ser alterado;
        //Saldo só deve ser acessível por meio do depositar, sacar e mostraInformacoes
        IO.println(c1.mostraInformacoes());
        c1.depositar(1000);
        IO.println(c1.mostraInformacoes());
        //c1.saldo = 0;
        IO.println(c1.mostraInformacoes());

    }
}
