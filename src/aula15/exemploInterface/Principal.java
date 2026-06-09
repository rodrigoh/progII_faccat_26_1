package aula15.exemploInterface;

public class Principal {
    static void main() {
        Vetor v1 = new Vetor(5);
        v1.adiciona("Elemento 01");
        v1.adiciona("Elemento 02");
        IO.println(v1.obterTamanho());
        v1.remove();
        IO.println(v1.obterTamanho());

        //Criando uma instância da interface
        //Para criar uma instância da interface temos que usar o construtor de uma classe que a implemente
        //Os métodos que estarão disponíveis na instância da interface são apenas os comuns entre a Classe Vetor e a Interface Lista
        //Portanto em l1 estarão disponíveis os métodos adiciona() e remove()
        //O método obterTamanho() é específico da classe Vetor, portanto não vai estar disponível.
        Lista l1 = new Vetor(6);


    }
}
