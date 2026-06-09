package aula15.exemploAbtrato.exemplo02;

public class ProcessarDebito extends ProcessarPagamento{

    public ProcessarDebito(double valor) {
        super(valor);
    }

    @Override
    public boolean processar() {
        //Acessar a plataforma de cartões para realizar o processamento
        return false;
    }
}
