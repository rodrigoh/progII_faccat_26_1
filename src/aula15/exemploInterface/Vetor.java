package aula15.exemploInterface;

public class Vetor implements Lista{
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    @Override
    public void adiciona(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public String remove() {
        String ultimo = elementos[--tamanho];
        return ultimo;
    }

    @Override
    public void ordenar() {
        //Implementar o método de ordenação
    }

    public int obterTamanho(){
        return tamanho;
    }
}
