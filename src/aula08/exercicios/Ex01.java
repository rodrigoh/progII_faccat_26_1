package aula08.exercicios;

public class Ex01 {
  //b² - 4*a*c
  static double calculaDelta(double a, double b, double c){
    double d = b*b-4*a*c;
    return d;
  }

  //(-b +- sqrt(d))/(2*a)
  static double[] calculaX(double a, double b, double d){
    double[] valorX = new double[2];
    valorX[0] = (-b+Math.sqrt(d))/(2*a);
    valorX[1] = (-b-Math.sqrt(d))/(2*a);
    return valorX;
  }

  static void main() {
    IO.println("Dada equação ax² + bx + c = 0 informe:");
    double a = Double.parseDouble(IO.readln("a: "));
    double b = Double.parseDouble(IO.readln("b: "));
    double c = Double.parseDouble(IO.readln("c: "));
    double d = calculaDelta(a,b,c);
    if(d>=0){
      double[] x = calculaX(a,b,d);
      IO.println("X1 = %.2f".formatted(x[0]));
      IO.println("X2 = %.2f".formatted(x[1]));

    }
    else
      IO.println("A equação não possui raízes no conjunto dos reais");
  }
}
