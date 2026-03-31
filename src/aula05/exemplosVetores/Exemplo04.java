package aula05.exemplosVetores;

public class Exemplo04 {
  static void main() {
    //Armazene uma quantidade desconhecida de valores
    int[] lista = new int[100];
    int cont = 0;
    char resp = 's';
    while (resp=='s' && cont<100){
      lista[cont] = Integer.parseInt(IO.readln("Digite valor para lista["+cont+"]: "));
      resp = IO.readln("Tem mais números (s - sim n - não): ").toLowerCase().charAt(0);
      cont++;
    }
    for (int i = 0; i < cont; i++) {
      IO.print(lista[i]+" ");
    }
  }
}
