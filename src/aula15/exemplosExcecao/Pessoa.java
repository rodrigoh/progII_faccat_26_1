package aula15.exemplosExcecao;

import java.sql.SQLException;

public class Pessoa {
    private String nome;

    public void setNome(String nome){
        if(nome.length()<2)
            throw new IllegalArgumentException("O nome precisa ter pelo menos dois dígitos");
        this.nome = nome;
    }

    //Aqui estamos declarando que nosso método lança exceções do tipo SQLException
    public void gravar() throws SQLException{
        //Todos os comandos que podem gerar exceções...
        String sql = "...";
        //Executar uma requisição
    }
}
