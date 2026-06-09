package aula15.exercicios.ex02;

public class Biblioteca {
    static void main() {
        Livro l1 = new Livro("Senhor dos anéis","J. R. R. Tolkien", 1955);
        Livro l2 = new Livro("Python para analise de dados","Mckinney",2023);
        l1.emprestar();
        IO.println(l1);
        IO.println(l2);
        l1.devolver();
        l1.emprestar();
        IO.println(l1);
        //Posso ler o atributo de forma indireta
        IO.println(l1.getTitulo());
        //Alterar o atributo de forma indireta
        l1.setTitulo("Novo título para o livro");
    }
}
