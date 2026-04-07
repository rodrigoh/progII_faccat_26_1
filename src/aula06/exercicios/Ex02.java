package aula06.exercicios;

/**
 * Faça um programa para ler 10 números DIFERENTES a serem armazenados em um vetor.
 * Os dados deverão ser armazenados no vetor na ordem que forem sendo lidos, sendo
 * que caso o usuário digite um número que já foi digitado anteriormente, o programa
 * deverá pedir para ele digitar outro número. Note que cada valor digitado pelo usuário
 * deve ser pesquisado no vetor, verificando se ele existe entre os números que já foram
 * fornecidos. Exibir na tela o vetor final que foi digitado.
 */
public class Ex02 {
  static void main() {
    int[] vetor = new int[10];

    for (int i = 0; i < vetor.length;) {
      int numero = Integer.parseInt(IO.readln("Digite o "+(i+1)+"° número: "));
      //Pesquisando o número no vetor
      boolean achei = false;
      for (int j = 0; j < i; j++) {
        if(numero==vetor[j])
          achei = true;
      }
      if(!achei){
        vetor[i] = numero;
        i++;
      }
      else{
        IO.println("Número já digitado");
      }
    }
    IO.println("Dados no vetor:");
    for (int i = 0; i < vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
  }
}
