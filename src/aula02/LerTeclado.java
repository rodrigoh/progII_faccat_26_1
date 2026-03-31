package aula02;

import java.util.Scanner;

public class LerTeclado {
  public static void main(String[] args) {
    //Scanner ler -> declara uma instância da classe Scanner (como se fosse uma variável)
    //new Scanner(System.in); -> Realiza a configuração inicial da instância
    Scanner ler = new Scanner(System.in);

    //Ler um número inteiro do teclado
    System.out.print("Digite um número inteiro: ");
    int numero = ler.nextInt();

    //Ler um número float do teclado
    System.out.print("Digite sua altura: ");
    float valor = ler.nextFloat();

    //Para ler uma String
    //O next() permite ler uma palavra do teclado
    System.out.print("Digite seu primeiro nome: ");
    String nome = ler.next();

    //Reiniciando a instância da classe Scanner para limpar o buffer
    ler = new Scanner(System.in);

    //O nextLine() permite ler uma frase ou texto
    System.out.print("Digite seu nome completo: ");
    nome = ler.nextLine();

    System.out.println("Nome: "+nome);
    System.out.printf("Nome: %s\n",nome);
    System.out.println("Número: "+numero);
    System.out.printf("Número: %d\n",numero);
    System.out.println("Número real: "+valor);
    System.out.printf("Número real: %.2f\n",valor);
  }
}
