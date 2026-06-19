package aula16.exercicio03;

public class Vetor extends Lista{

  public Vetor(int capacidade){
    super(capacidade);
  }
  @Override
  public void adiciona(String elemento) {
    aumentaCapacidade();
    elementos[tamanho] = elemento;
    tamanho++;
  }

  @Override
  public void adiciona(int posicao, String elemento) {
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

  @Override
  public String obterElemento(int posicao) {
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("Posição precisa estar entre 0 e o tamanho da lista");
    return elementos[posicao];
  }

  @Override
  public String remove(int posicao) {
    if(posicao<0 || posicao>=tamanho)
      throw new IllegalArgumentException("Posição precisa estar entre 0 e o tamanho da lista");
    String copia = elementos[posicao];
    for (int i = posicao; i < tamanho-1; i++) {
      elementos[i] = elementos[i+1];
    }
    tamanho--;
    return copia;
  }

  @Override
  public void remove(String elemento) {
    int posicao = posicaoDe(elemento);
    if(posicao!=-1)
      remove(posicao);
  }

  @Override
  public int tamanho() {
    return tamanho;
  }

  @Override
  public void limpar() {
    tamanho = 0;
  }

  @Override
  public int posicaoDe(String elemento) {
    for (int i = 0; i < tamanho; i++) {
      if(elementos[i].equals(elemento))
        return i;
    }
    return -1;
  }

  @Override
  public int ultimaPosicaoDe(String elemento) {
    int posicao = -1;
    for (int i = 0; i < tamanho; i++) {
      if(elementos[i].equals(elemento))
        posicao = i;
    }
    return posicao;
  }

  @Override
  public boolean estaVazia() {
    return tamanho==0;
  }

  @Override
  public boolean contem(String elemento) {
    return posicaoDe(elemento)!=-1;
  }
}
