package aula09.exemplosPOO.exemplo01;

public class ExemploInstancia {
  static void main() {
    Carro c1 = new Carro();
    c1.marca = "VW";
    c1.modelo = "fusca";
    c1.cor = "azul";
    c1.km = 100_000;
    c1.anoFabricacao = 1980;
    c1.andar();
    c1.abastecer(10);
    c1.parar();
    Carro fiat500 = new Carro();
    fiat500.marca = IO.readln("Qual a marca do carro: ");
    fiat500.modelo = IO.readln("Qual o modelo do carro: ");
    fiat500.cor = IO.readln("Qual a cor do "+fiat500.marca+" "+fiat500.modelo+": ");
    fiat500.km = Integer.parseInt(IO.readln("Qual a km atual: "));
    fiat500.anoFabricacao = Integer.parseInt(IO.readln("Qual o ano de fabricação: "));
    fiat500.andar();
    float quantLitros = Float.parseFloat(IO.readln("Quantos litros deseja abastecer: "));
    fiat500.abastecer(quantLitros);
    fiat500.parar();
  }
}
