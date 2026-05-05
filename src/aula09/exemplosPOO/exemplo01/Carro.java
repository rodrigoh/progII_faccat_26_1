package aula09.exemplosPOO.exemplo01;

public class Carro {
  String marca;
  String modelo;
  String cor;
  int km;
  int anoFabricacao;

  void abastecer(float quantidade){
    IO.println(modelo+" está abastecendo "+quantidade+" litros");
  }
  void andar(){
    IO.println(modelo+" está andando");
  }
  void parar(){
    IO.println(modelo+" está parado");
  }
}
