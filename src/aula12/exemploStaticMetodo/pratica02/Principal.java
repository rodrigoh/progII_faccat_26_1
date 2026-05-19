package aula12.exemploStaticMetodo.pratica02;

public class Principal {
    static void main() {
        double tempC = Double.parseDouble(IO.readln("Informe uma temperatura em ºC: "));
        double tempF = Conversor.celsiusParaFahrenheit(tempC);
        IO.println(tempC+"° C equivale a "+tempF+"°F");

        double metros = Double.parseDouble(IO.readln("Informe uma medida em metros: "));
        double cm = Conversor.metrosParaCentimetros(metros);
        IO.println(metros+"m equivale a "+cm+"cm");

        double valorReal = Double.parseDouble(IO.readln("Informe um valor R$"));
        double taxa = Double.parseDouble(IO.readln("Qual a taxa de câmbio R$ "));
        double dolar = Conversor.realParaDolar(valorReal, taxa);
        IO.println("R$ %.2f valem US$ %.2f".formatted(valorReal, dolar));
    }
}
