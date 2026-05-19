package aula12.exemploStaticMetodo.exemplo01;

public class Operacoes {
    //É um método que existe independente da criação de instâncias
    static int soma(int n1, int n2){
        return n1+n2;
    }

    static int leInteiro(String mensagem){
        return Integer.parseInt(IO.readln(mensagem+": "));
    }

    static double leDouble(String mensagem){
        return Double.parseDouble(IO.readln(mensagem+": "));
    }

    static double potencia(double base, double expoente){
        double mult = 1;
        for (int i = 0; i < expoente; i++) {
            mult *= base;
        }
        return mult;
    }
}
