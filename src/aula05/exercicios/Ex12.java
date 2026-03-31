package aula05.exercicios;

/**
 * Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. 
 * Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou 
 * igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
 * */
public class Ex12 {
  static void main() {
    int quantAtual = Integer.parseInt(IO.readln("Informe a quantidade atual em estoque: "));
    int quantMinima = Integer.parseInt(IO.readln("Qual a quantidade mínima em estoque: "));
    int quantMaxima = Integer.parseInt(IO.readln("Qual a quantidade máxima em estoque: "));
    float quantMedia = (quantMaxima+quantMinima)/2;
    if(quantAtual>=quantMedia){
      IO.println("Não é necessário efetuar compra");
    }
    else{
      IO.println("Efetuar compra");
    }

  }
}
