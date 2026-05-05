package aula09.exemplosPOO.exemplo02;

public class Caneta {
  String fabricante;
  String cor;
  int quantidadeTinta;

  void escrever(String texto){
    if(quantidadeTinta>0){
      IO.println(texto);
      quantidadeTinta--;
    }
  }
}
