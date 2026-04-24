package aula07.revisao;

public class Ex09 {
  static double calculaMedia(double[] vetor){
    double soma = 0;
    for (int i = 0; i < vetor.length; i++)
      soma+=vetor[i];
    return soma/vetor.length;
  }

  static double calculaMediana(double[] vetor){
    double[] copia = ordenaVetor(vetor);
    int meio = (int) copia.length/2;
    if(copia.length%2==0)
      return (copia[meio]+copia[meio-1])/2;
    return copia[meio];
  }

  static double[] ordenaVetor(double[] vetor){
   //Copiando o vetor
   double[] copia = new double[vetor.length];
   System.arraycopy(vetor,0,copia,0,vetor.length);
   //Alternativa
   //Arrays.sort(copia);
   //Ordenando insertion sort
    for(int i=1; i<copia.length;i++){
      double chave = copia[i];
      int j = i-1;
      while (j>=0 && copia[j]>chave){
        copia[j+1] = copia[j];
        j--;
      }
      copia[j+1] = chave;
    }
    return copia;
  }

  static double calculaDevioPadrao(double[] vetor){
    double media = calculaMedia(vetor);
    int n = vetor.length;
    double soma = 0;
    //soma dos quadrados dos desvios
    for (int i = 0; i < n; i++) {
      soma+=Math.pow((vetor[i] - media),2);
    }
    //calcular o desvio padrão (raiz quadrada da variância)
    return Math.sqrt(soma/n);
  }

  static int posicaoDe(double[] vetor, double elemento){
    for (int i = 0; i < vetor.length; i++)
      if(elemento==vetor[i])
        return i;
    return -1;
  }

  static String mostraVetor(double[] vetor){
    String retorno = "\nDados no vetor\n";
    for (int i = 0; i < vetor.length; i++) {
      retorno+=vetor[i]+" ";
    }
    return retorno;
  }

  static void main(){
    double[] v1 = {10, 6, 4, 8, 2};
    IO.println(mostraVetor(v1));
    double media = calculaMedia(v1);
    double mediana = calculaMediana(v1);
    double desvio = calculaDevioPadrao(v1);
    IO.println("Média dos elementos %.3f".formatted(media));
    IO.println("Medina dos elementos %.3f".formatted(mediana));
    IO.println("Devio padrão dos elementos %.3f".formatted(desvio));
    //
    double[] v2 = {21,10,5,15,9,11};
    IO.println(mostraVetor(v2));
    media = calculaMedia(v2);
    mediana = calculaMediana(v2);
    desvio = calculaDevioPadrao(v2);
    IO.println("Média dos elementos %.3f".formatted(media));
    IO.println("Medina dos elementos %.3f".formatted(mediana));
    IO.println("Devio padrão dos elementos %.3f".formatted(desvio));
  }
}
