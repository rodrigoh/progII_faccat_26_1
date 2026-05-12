package aula11.exemploPoo.conta;

import java.util.Random;

public class Conta {
  String titular;
  String identificador;
  float saldo;

  Conta(String titular){
    this.titular = titular;
    identificador = geraIdentificador();
  }

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
