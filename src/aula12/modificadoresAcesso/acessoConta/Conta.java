package aula12.modificadoresAcesso.acessoConta;

import java.util.Random;

//Declaração da classe que representa nosso objeto
public class Conta {

  //Os atributos deste objeto
  String titular;
  String identificador;
  private float saldo;

  //Construtor deste objeto, não possui qualquer tipo de retorno, e como tem o mesmo nome da classe será escrito com inicial maiúscula
  Conta(String titular){
    this.titular = titular;
    identificador = geraIdentificador();
    saldo = 0;
  }

  //Demais ações ou métodos que o obejeto pode realizar.
  boolean sacar(float valor){
    if(saldo>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  void depositar(float valor){
    saldo+=valor;
  }

  String mostraInformacoes(){
    String retorno = "Titular: "+titular;
    retorno+="\nIdentificador: "+identificador;
    retorno+="\nSaldo R$%.2f".formatted(saldo);
    return retorno;
  }

  String geraIdentificador(){
    Random aleatorio = new Random();
    String identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador+=(char)aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(1000,9999);
  return identificador;
  }
}
