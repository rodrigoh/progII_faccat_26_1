package aula05.exemplosVetores;

import java.util.Random;

public class NumerosAleatorios {
  static void main() {
    Random aleatorio = new Random();
    //Gerar um número inteiro aleatório
    int numero = aleatorio.nextInt();
    IO.println("Inteiro aleatório: "+numero);
    numero = aleatorio.nextInt(100);
    IO.println("Inteiro até 100: "+numero);
    numero = aleatorio.nextInt(-10,10);
    IO.println("Inteiro entre -10 e 10: "+numero);

    //Números float aleatórios
    float numeroReal = aleatorio.nextFloat(-10,10);
    IO.println("Número float entre -10 e 10: "+numeroReal);
    IO.println("Número float entre -10 e 10: %.3f".formatted(numeroReal));
    System.out.println("Número float entre -10 e 10: %.3f".formatted(numeroReal));
    IO.println("Número float entre -10 e 10: "+String.format("%.3f",numeroReal));
    System.out.println("Número float entre -10 e 10: "+String.format("%.3f",numeroReal));

    //Boolean aleatório
    boolean valor = aleatorio.nextBoolean();
    IO.println("\nTrue ou False: "+valor);
    //(teste_lógico ? valor_verdadeiro : valor_falso)
    IO.println("Cara ou coroa: "+(valor?"Cara":"Coroa"));

  }
}
