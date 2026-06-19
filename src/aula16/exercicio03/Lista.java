package aula16.exercicio03;

public abstract class Lista {
  protected String[] elementos;
  protected int tamanho;

  public Lista(int capacidade){
    elementos = new String[capacidade];
    tamanho = 0;
  }

  //Adiciona um elemento ao final da lista.
  public abstract void adiciona(String elemento);

  //Insere um elemento em uma posição específica.
  public abstract void adiciona(int posicao, String elemento);

  //Retorna o elemento da posição informada.
  public abstract String obterElemento(int posicao);

  //Remove o elemento da posição indicada.
  public abstract String remove(int posicao);

  //Remove um elemento pelo elemento
  public abstract void remove(String elemento);

  //Obtém o tamanho da lista
  public abstract int tamanho();

  //Limpa a lista
  public abstract void limpar();

  //Obtém a posição de um elemento (retorna -1 se não achar)
  public abstract int posicaoDe(String elemento);

  //Obtém a última posição de determinado elemento em caso de ocorrências duplicadas (retorna -1 se não achar)
  public abstract int ultimaPosicaoDe(String elemento);

  //Verifica se a lista está vazia
  public abstract boolean estaVazia();

  //Verifica se um elemento existe na lista
  public abstract boolean contem(String elemento);

  //Aumenta a capacidade da lista
  protected void aumentaCapacidade(){
    if(tamanho==elementos.length){
      String[] aux = new String[tamanho*2];
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
