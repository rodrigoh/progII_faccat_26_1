package aula11.exemploPoo.conta;

public class Banco {

  static Conta acessaConta(Conta conta){
    char opc;
    do{
      IO.println("Bem vindo "+conta.titular);
      IO.println("Você está acessando a conta "+conta.identificador);
      IO.println("Selecione uma opção");
      IO.println("d - depositar");
      IO.println("s - sacar");
      IO.println("m - verificar saldo");
      IO.println("v - voltar para o menu anterior");
      opc = IO.readln(": ").toLowerCase().charAt(0);
      switch (opc){
        case 'd'->{
          float valor = Float.parseFloat(IO.readln("Qual valor deseja depositar: "));
          conta.depositar(valor);
          IO.println("Deposito realizado!");
        }
        case 's'->{
          float valor = Float.parseFloat(IO.readln("Qual valor deseja sacar: "));
          if(conta.sacar(valor)){
            IO.println("Saque realizado com sucesso!");
          }
          else{
            IO.println("Saldo insuficiente");
          }
        }
        case 'm'->{
          IO.println(conta.mostraInformacoes());
        }
      }
    }
    while (opc!='v');
    return conta;
  }


  static void main() {
    //Lista de contas
    Conta[] lista = new Conta[10];
    int cont=0;
    char opc;
    do{
      IO.println("Selecione uma opção");
      IO.println("c - cadastrar uma nova conta");
      IO.println("a - acessar uma conta");
      IO.println("s sair");
      opc = IO.readln(": ").toLowerCase().charAt(0);
      switch (opc){
        case 'c'->{
          if(cont<lista.length) {
            String titular = IO.readln("Qual seu nome: ");
            lista[cont] = new Conta(titular);
            IO.println("Conta criada com o seguinte identificador: " + lista[cont].identificador);
            cont++;
          }
          else{
            IO.println("O banco tem o número máximo de clientes");
          }
        }
        case 'a'->{
          String identificador = IO.readln("Qual o identificador da conta: ");
          //Verficando se a conta existe
          int posicao = -1;
          for (int i = 0; i < cont; i++) {
            if(lista[i].identificador.equalsIgnoreCase(identificador)){
              posicao = i;
            }
          }
          if(posicao!=-1){
            lista[posicao] = acessaConta(lista[posicao]);
          }
          else{
            IO.println("A conta "+identificador+" não existe");
          }
        }
      }
    }
    while (opc!='s');
  }
}
