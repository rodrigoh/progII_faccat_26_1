package aula12.exemploStaticMetodo.exemplo01;

public class Exemplo01 {
    static void main() {
        int n1 = Operacoes.leInteiro("Digite um número");
        int n2 = Operacoes.leInteiro("Digite outro número");
        //Posso acessar os métodos diretamente da classe
        int soma = Operacoes.soma(n1,n2);
        IO.println("A soma de "+n1+" com "+n2+" vale "+soma);

        double base = Operacoes.leDouble("Qual a base");
        double expoente = Operacoes.leDouble("Qual o expoente");

        double potencia = Operacoes.potencia(base,expoente);
        IO.println(base+"^"+expoente+"="+potencia);

    }
}
