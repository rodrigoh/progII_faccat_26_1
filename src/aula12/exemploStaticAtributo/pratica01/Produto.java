package aula12.exemploStaticAtributo.pratica01;

public class Produto {
    String nome;
    int codigo;
    float preco;
    //Com este atributo é possível realizar uma contagem "global"
    static int quantidadeProdutos;

    Produto(int codigo, String nome, float preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        quantidadeProdutos++;
    }

    String obterDados(){
        String produto = "Código: "+codigo;
        produto+="\nNome: "+nome;
        produto+="\nPreço R$ %.2f".formatted(preco);
        return produto;
    }


}
