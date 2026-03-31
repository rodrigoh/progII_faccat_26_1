package aula05.exercicios;




/**
 * Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em
 * Celsius. Em seguida mostre na tela o valor final correspondente à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
 */
public class Ex07 {
  static void main() {
    char resposta = IO.readln("Selecione C para converter de °C para °F ou F para conveter de °F para °C").toLowerCase().charAt(0);
    if(resposta == 'c'){
      float tempC = Float.parseFloat(IO.readln("Informe uma temperatura em °C: "));
      float tempF = 1.8f * tempC + 32;
      IO.println("%.2f°C equivale(m) a %.2f°F".formatted(tempC,tempF));
    }
    else if(resposta=='f'){
      float tempF = Float.parseFloat(IO.readln("Informe uma temperatura em °F: "));
      float tempC = (tempF - 32) / 1.8f;
      IO.println("%.2f°F equivale(m) a %.2f°C".formatted(tempF,tempC));
      IO.println(tempF+"°F equivale(m) a "+tempC+"°C");
    }
    else{
      IO.println("A opção "+resposta+" não é válida");
    }
  }
}
