package aula14.exemploPolimorfismo.exOverride;

public class ContaCorrente extends Conta{
  private double limite;

  public ContaCorrente(String titular, double limite){
    super(titular);
    this.limite = limite;
  }

  @Override
  public boolean sacar(double valor){
    if(saldo+limite>=valor){
      saldo-=valor;
      return true;
    }
    return false;
  }

  @Override
  public String verificaSaldo(){
    String retorno = "Seu saldo é de R$%.2f".formatted(saldo);
    if(saldo<0){
      retorno+="\nSeu limite disponível é de R$%.2f".formatted(limite+saldo);
    }
    else{
      retorno+="\nSeu limite disponível é de R$%.2f".formatted(limite);
    }
    return retorno;
  }

}
