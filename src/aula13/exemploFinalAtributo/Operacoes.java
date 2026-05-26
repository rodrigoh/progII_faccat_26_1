package aula13.exemploFinalAtributo;

public class Operacoes {
  /*Ao definir uma variável como final
    Ela obrigatóriamente precisa ter um valor
    atribuído até o final da execução do construtor
    E este valor não poderá mais ser alterado
  */
  public final double valorPI;
  //Estamos definindo o valor para variável no construtor
  public Operacoes(){
    valorPI = 3.14;
  }
  //A construção deste método não é possível, já que valorPI é final
//  public void setValorPI(double valor){
//    valorPI = valor;
//  }
}
