package aula15.exercicios.ex02;

public class Livro {
    private int idLivro;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
    private int contEmprestimo;
    private static int contLivros;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        disponivel = true;
        contEmprestimo = 0;
        contLivros++;
        idLivro = contLivros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.length()>=3)
            this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public static int getContLivros() {
        return contLivros;
    }

    public int getContEmprestimo() {
        return contEmprestimo;
    }

    public void emprestar(){
        if(disponivel) {
            disponivel = false;
            contEmprestimo++;
        }
    }

    public void devolver(){
        disponivel = true;
    }

    @Override
    public String toString() {
        return "ID=" + idLivro +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno de publicação:" + anoPublicacao +
                "\nDisponível=" + (disponivel?"Sim":"Não") +
                "\nVezes emprestado: " + contEmprestimo;
    }
}
