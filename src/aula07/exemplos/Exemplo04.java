package aula07.exemplos;

public class Exemplo04 {
  //Calcula Delta
  static double calculaDelta(double a, double b, double c){
    return b*b-4*a*c;
  }

  //Calcula X
  static double[] calculaX(double a, double b, double d){
    double[] x = new double[2];
    x[0] = (-b + Math.sqrt(d))/(2*a);
    x[1] = (-b - Math.sqrt(d))/(2*a);
    return x;
  }

  static void main() {
    IO.println("Dada a equação ax² -bx +c = 0, informe:");
    double a = Integer.parseInt(IO.readln("a = "));
    double b = Integer.parseInt(IO.readln("b = "));
    double c = Integer.parseInt(IO.readln("c = "));
    double d = calculaDelta(a,b,c);
    if(d>=0){
      double[] x = calculaX(a,b,d);
      IO.println("As raízes da equação são");
      IO.println("x1: %.3f".formatted(x[0]));
      IO.println("x2: %.3f".formatted(x[1]));
    }
    else{
      IO.println("A equação não possui raízes no conjunto dos reais");
    }
  }

}
