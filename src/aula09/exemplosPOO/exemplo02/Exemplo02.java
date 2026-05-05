package aula09.exemplosPOO.exemplo02;

public class Exemplo02 {
  static void main() {
    Caneta caneta01 = new Caneta();
    caneta01.fabricante = "BIC";
    caneta01.cor = "branco";
    caneta01.quantidadeTinta = 10;
    for (int i = 0; i < 20; i++) {
      caneta01.escrever("Escrevendo a linha "+(i+1));
    }
  }
}
