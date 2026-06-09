package aula15.exemplosExcecao;

import java.util.Scanner;

public class Exemplo01 {
    static void main() {
        //Tamanho = 4
        //indices 0 a 3
        int[] lista = {1,2,3,4};

        //lista[4] = 10;

        //int numero = Integer.parseInt(IO.readln("Digite um número: "));
        boolean valido;
        do {
            try {
                int n1 = Integer.parseInt(IO.readln("Digite um número: "));
                int n2 = Integer.parseInt(IO.readln("Digite outro número: "));
                float resultado = n1 / n2;
                IO.println(resultado);
                valido = true;
            }
            catch (NumberFormatException erro) {
                IO.println("Os valores precisam ser números");
                valido = false;
            }
            catch (ArithmeticException erro) {
                IO.println("Não é possível dividir por zero");
                valido = false;
            }
            //Como o classe Exception é super classe de todas as Exceptions ela "pode" capturar todos os erros
            catch (Exception e){
                IO.println("Mais alguma coisa deu errado");
                valido = false;
            }
            finally {
                IO.println("Aqui está o bloco finally");
            }
        }
        while(!valido);


        //Podemos criar uma variável erro
//        boolean erro;
//        do {
//            try {
//                int n1 = Integer.parseInt(IO.readln("Digite um número: "));
//                int n2 = Integer.parseInt(IO.readln("Digite outro número: "));
//                float resultado = n1 / n2;
//                IO.println(resultado);
//                erro = false;
//            }
//            catch (NumberFormatException e) {
//                IO.println("Os valores precisam ser números");
//                erro = true;
//            }
//            catch (ArithmeticException e) {
//                IO.println("Não é possível dividir por zero");
//                erro = true;
//            }
//            catch (Exception e){
//                IO.println("Erro");
//                erro = true;
//            }
//        }
//        while(erro);
    }
}
