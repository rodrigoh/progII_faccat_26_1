package aula15.exemplosExcecao;

import java.sql.SQLException;

public class Principal {
    static void main() throws SQLException {
        Pessoa p1 = new Pessoa();
        p1.setNome("a");
        try {
            p1.setNome("Ana");
        }
        catch (IllegalArgumentException e){
            //Obtendo a mensagem do erro
            IO.println(e.getMessage());
            //Imprime a pilha do erro
            //e.printStackTrace();
        }

        //Como o método gravar lança uma exceção do tipo SQLException, sou obrigado a tratar
        try {
            p1.gravar();
        }
        catch (SQLException e) {
            IO.println("Erro ao executar SQL");
        }
    }
}
