package aula17.exemploGenerics;

public class Vetor<T> {
  private T[] elementos;
  private int tamanho;

  public Vetor(int capacidade){
    elementos = (T[]) new Object[capacidade];
    tamanho = 0;
  }

  public void adiciona(T elemento) {
    aumentaCapacidade();
    elementos[tamanho] = elemento;
    tamanho++;
  }

  public void adiciona(int posicao, T elemento) {
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("Posição precisa estar entre 0 e o tamanho da lista");
    aumentaCapacidade();
    //Desloncando os elementos para liberar a posição
    for (int i = tamanho-1; i >=posicao; i--) {
      elementos[i+1] = elementos[i];
    }
    //Inserindo o elemento na posição
    elementos[posicao] = elemento;
    tamanho++;
  }

  public T obterElemento(int posicao) {
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("Posição precisa estar entre 0 e o tamanho da lista");
    return elementos[posicao];
  }

  public T remove(int posicao) {
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("Posição precisa estar entre 0 e o tamanho da lista");
    T copia = elementos[posicao];
    for (int i = posicao; i < tamanho-1; i++) {
      elementos[i] = elementos[i+1];
    }
    tamanho--;
    return copia;
  }

  public void remove(T elemento) {
    int posicao = posicaoDe(elemento);
    if(posicao!=-1)
      remove(posicao);
  }

  public int tamanho() {
    return tamanho;
  }

  public void limpar() {
    tamanho = 0;
  }

  public int posicaoDe(T elemento) {
    for (int i = 0; i < tamanho; i++) {
      if(elementos[i].equals(elemento))
        return i;
    }
    return -1;
  }

  public int ultimaPosicaoDe(T elemento) {
    int posicao = -1;
    for (int i = 0; i < tamanho; i++) {
      if(elementos[i].equals(elemento))
        posicao = i;
    }
    return posicao;
  }

  public boolean estaVazia() {
    return tamanho==0;
  }

  public boolean contem(T elemento) {
    return posicaoDe(elemento)!=-1;
  }

  protected void aumentaCapacidade(){
    if(tamanho==elementos.length){
      T[] aux = (T[]) new Object[tamanho*2];
      for (int i = 0; i < tamanho; i++)
        aux[i] = elementos[i];
      elementos = aux;
    }
  }

  //Exibe os elementos
  @Override
  public String toString(){
    StringBuilder dados = new StringBuilder("[");
    if(tamanho>0) {
      for (int i = 0; i < tamanho - 1; i++) {
        dados.append(elementos[i]);
        dados.append(", ");
      }
      dados.append(elementos[tamanho-1]);
    }
    dados.append("]");
    return dados.toString();
  }
}
