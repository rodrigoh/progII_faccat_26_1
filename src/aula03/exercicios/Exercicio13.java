package aula03.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Escreva um programa para ler: a marcação do odômetro (Km) no início do dia,
 * a marcação (Km) no final do dia, o número de litros de combustível gasto, o
 * valor do litro do combustível e o valor total (R$) recebido dos passageiros.
 * Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.
 */
public class Exercicio13 {
  static void main() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual a km inicial: ");
    int kmInicial = ler.nextInt();
    System.out.print("Qual a km final: ");
    int kmFinal = ler.nextInt();
    System.out.print("Quantos litros de combustível foram usados: ");
    double litros = ler.nextDouble();
    System.out.print("Qual o preço do litro de combustível R$");
    double precoLitro = ler.nextDouble();
    System.out.print("Qual o valor bruto recebido R$");
    double valorRecebido = ler.nextDouble();

    double distacia = kmFinal-kmInicial;
    double autonomia = distacia/litros;
    double lucro = valorRecebido-precoLitro*litros;
    System.out.printf("A autonomia foi de %.2fkm/l\n",autonomia);
    System.out.printf("O lucro foi de R$%.2f\n",lucro);

  }
}
