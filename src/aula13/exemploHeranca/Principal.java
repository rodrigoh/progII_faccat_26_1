package aula13.exemploHeranca;

public class Principal {
  static void main() {
    Colaborador c1 = new Colaborador("a123","Jonas","Souza");
    c1.setNome("Jonas");
    c1.setSobrenome("Souza");
    c1.setMatricula("a123");;
    c1.setMail("jonas@empresa.com.br");
    IO.println("Nome: "+c1.getNome());
    Medico m1 = new Medico("a124","Ana","Silva","rs9755625");
    m1.setNome("Ana");
    m1.setSobrenome("Silva");
    m1.setMail("ana@empresa.com.br");
    m1.setMatricula("a124");
    Engenheiro e1 = new Engenheiro("a125","Pedro","Souza","4654566546");
    e1.setNome("Pedro");
    IO.println("A quantidade de colaboradores é "+e1.getContador());
    m1.setSalario(3000);
    IO.println("O salário atual do "+m1.getNome()+" é de ");
    IO.println("R$%.2f".formatted(m1.getSalario()));
    m1.aumento(100);
    IO.println("E após o aumento");
    IO.println("R$%.2f".formatted(m1.getSalario()));

  }
}
