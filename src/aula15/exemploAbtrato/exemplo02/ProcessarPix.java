package aula15.exemploAbtrato.exemplo02;

public class ProcessarPix extends ProcessarPagamento{

    public ProcessarPix(double valor) {
        super(valor);
    }

    @Override
    public boolean processar() {
        //Gerar o qrCode e esperar o pagamento;
        return false;
    }
}
