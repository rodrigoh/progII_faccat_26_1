package aula03.exemplosSelecao;

public class ExemploIf02 {
  static void main() {
    String usuario = IO.readln("Digite seu usuário: ");
    String senha = IO.readln("Digite sua senha: ");

    if(usuario.equals("admin") && senha.equals("1234")){
      IO.println("Bem vindo, "+usuario);
    }
    else{
      IO.println("Usuário ou senha incorretos");
    }
  }
}
