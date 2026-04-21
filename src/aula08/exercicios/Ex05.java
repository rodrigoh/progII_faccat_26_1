package aula08.exercicios;

/**
 * Crie uma classe de conversão entre as temperaturas Celsius e Farenheit.
 * Primeiro o usuário deve escolher se vai entrar com a temperatura em Célsius ou Farenheit,
 * depois a conversão escolhida é realizada através de um comando SWITCH.
 * Se C é a temperatura em Célsius e F em farenheit, as fórmulas de conversão
 * são:
 * C= 5.(F-32)/9
 * F= (9.C/5) + 32
 */
public class Ex05 {
  static double converteCParaF(double tempC){
    return (9*tempC/5) + 32;
  }

  static double converteFParaC(double tempF){
    return 5*(tempF-32)/9;
  }

  //se char opc == 'c' convertemos de °C para °F
  //Se char opc == 'f' convertemos de °F para °C
  static double converteTemp(double tempO, char opc){
    if(opc=='c'){
      return (9*tempO/5) + 32;
    }
    else{
      return 5*(tempO-32)/9;
    }
  }

  static void main() {
    IO.println("Selecione uma opção do menu");
    IO.println("C para converter de °C para °F");
    IO.println("F para converter de °F para °C");
    char opc = IO.readln(": ").toLowerCase().charAt(0);
    switch (opc){
      case 'c'-> {
        double tempC = Double.parseDouble(IO.readln("Qual a temperatura em °C? "));
        double tempF = converteCParaF(tempC);
        //tempF = converteTemp(tempC,opc);
        IO.println("%.2f °C equivale(m) a %.2f ºF".formatted(tempC, tempF));
      }
      case 'f'-> {
        double tempF = Double.parseDouble(IO.readln("Qual a temperatura em °F? "));
        double tempC = converteFParaC(tempF);
        //tempC = converteTemp(tempF,opc);
        IO.println("%.2f °F equivale(m) a %.2f ºC".formatted(tempF, tempC));
      }
    }
  }
}
