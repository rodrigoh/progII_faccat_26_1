package aula14.exemploPolimorfismo.exOverride;

import java.util.Random;

public class Conta {
  private String titular;
  private String identificador;
  protected double saldo;

  public Conta(String titular){
    this.titular = titular;
    geraIdentificador();
  }

  public String getTitular(){
    return titular;
  }

  public void setTitular(String titular){
    if(titular.length()>=2)
      this.titular = titular;
  }

  public String getIdentificador(){
    return identificador;
  }

  public boolean sacar(double valor){
    if(valor<=saldo){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public void depositar(double valor){
    if(valor>0)
      saldo+=valor;
  }

  private void geraIdentificador(){
    identificador = "";
    Random aleatorio = new Random();
    for (int i = 0; i < 4; i++) {
      identificador+=(char)aleatorio.nextInt(65,90);
    }
    identificador+=aleatorio.nextInt(1000,9999);
  }

  public String verificaSaldo(){
    return "Seu saldo atual é de R$%.2f".formatted(saldo);
  }

  @Override
  public String toString(){
    return "Identificador: "+identificador+" Titular: "+titular+"\n"+verificaSaldo();
  }
}
