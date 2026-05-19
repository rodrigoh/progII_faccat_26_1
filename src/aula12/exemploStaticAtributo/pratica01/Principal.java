package aula12.exemploStaticAtributo.pratica01;

public class Principal {
    static void main() {
        Produto p1 = new Produto(1, "Teclado", 150);
        IO.println("Até agora foram cadastrados "+Produto.quantidadeProdutos+" produtos");
        Produto p2 = new Produto(2,"Monitor",1100);
        Produto p3 = new Produto(3,"Mouse",150);
        IO.println(p1.obterDados());
        IO.println(p2.obterDados());
        IO.println(p3.obterDados());
        IO.println("Até agora foram cadastrados "+Produto.quantidadeProdutos+" produtos");
    }
}
