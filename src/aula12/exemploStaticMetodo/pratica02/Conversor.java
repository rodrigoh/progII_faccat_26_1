package aula12.exemploStaticMetodo.pratica02;

public class Conversor {
    //Todos os métodos podem ser acessados diretamente da classe
    static double celsiusParaFahrenheit(double c){
        return (c*1.8)+32;
    }
    static double metrosParaCentimetros(double m){
        return m*100;
    }
    static double realParaDolar(double valor, double taxa){
        return valor/taxa;
    }
}
