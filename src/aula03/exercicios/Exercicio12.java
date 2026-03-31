package aula03.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler as dimensões de uma cozinha retangular
 * (comprimento, largura e altura), calcular e escrever a quantidade de caixas
 * de azulejos para se colocar em todas as suas paredes. Também deve ser lido
 * um valor equivalente a área das Janelas e portas para descontar da área total.
 * Cada caixa de azulejos possui 1,5 m².
 */
public class Exercicio12 {
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o comprimento da cozinha: ");
    double comprimento = ler.nextDouble();
    System.out.print("Qual a largura da cozinha: ");
    double largura = ler.nextDouble();
    System.out.print("Qual a altura da cozinha: ");
    double altura = ler.nextDouble();
    System.out.print("Qual a área ocupada por aberturas: ");
    double areaAberturas = ler.nextDouble();
    double areaTotal = 2*altura*largura+2*altura*comprimento-areaAberturas;
    double quantCaixas = areaTotal/1.5;
    System.out.printf("Para cobrir os %.2f m² de parede serão necessárias %.2f caixas\n",areaTotal,quantCaixas);

  }
}
