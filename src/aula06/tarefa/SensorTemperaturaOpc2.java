package aula06.tarefa;

import java.util.Arrays;

public class SensorTemperaturaOpc2 {
  static void main() {
    double[] vetorTeste = {20.5, 21.0, 19.8, -5.0, 22.1, 23.5, 24.0, 22.8, 110.0, 25.2, 26.0, 27.5, 30.0, 31.2, 32.5, 30.0, 28.5, 26.2, 25.0, 24.5, 23.0, 22.0, 21.5, 20.8};
    double[] temperaturas = new double[24];
    boolean[] ruido = new boolean[24];
    double soma = 0;
    double somaValidas = 0;
    int contValidas = 0;
    double maior=0;
    double menor=0;
    int hMaior=0;
    int hMenor=0;

    for (int i = 0; i < temperaturas.length; i++) {
       double temperatura = vetorTeste[i];
      //Double.parseDouble(IO.readln("Temperatura as "+i+" horas: "));
       if(temperatura<0 || temperatura>100){
         ruido[i] = true;
         IO.println("Ruido detectado na hora "+i+" %.2f °C".formatted(temperatura));
         if(i==0)
           temperatura = 0;
         else
           temperatura = soma / i;
       }
       else{
         somaValidas+=temperatura;
         if(contValidas==0){
           maior = temperatura;
           menor = temperatura;
         }
         if(temperatura>maior) {
           maior = temperatura;
           hMaior = i;
         }
         if(temperatura<menor) {
           menor = temperatura;
           hMenor = i;
         }
         contValidas++;
       }
       temperaturas[i] = temperatura;
       soma+=temperatura;
    }
    double tempMedia = somaValidas/contValidas;
    double valorAnomalia = tempMedia*1.2;
    IO.println("Relatório do dia");
    IO.println("Temperatura média %.2f °C".formatted(tempMedia));
    IO.println("Temperatura mínima %.2f °C, ocorreu às %d horas".formatted(menor, hMenor));
    IO.println("Temperatura máxima %.2f °C, ocorreu às %d horas".formatted(maior, hMaior));
    for (int i = 0; i < temperaturas.length; i++) {
      IO.print("Às %d horas a temperatura foi de %.2f °C  - ".formatted(i, temperaturas[i]));
      if(temperaturas[i]>=valorAnomalia)
        IO.println("[ANOMALIA]");
      else if(ruido[i])
        IO.println("[RUÍDO] (substituído)");
      else
        IO.println("[OK]");
    }
    if(maior-menor<15){
      IO.println("O sistema operou de forma estável");
    }
    else{
      IO.println("O sistema operou de forma instável");
    }
  }
}
