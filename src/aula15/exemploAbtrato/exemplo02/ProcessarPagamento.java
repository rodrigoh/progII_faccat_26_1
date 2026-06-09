package aula15.exemploAbtrato.exemplo02;

public abstract class ProcessarPagamento {
    private double valor;

    public ProcessarPagamento(double valor){
        this.valor = valor;
    }

    public void emitirComprovante(){
        //Implementar o comprovante aqui...
    }

    public abstract boolean processar();
}
