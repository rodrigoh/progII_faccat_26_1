package aula12.exemploStaticAtributo.exemplo01;

public class Carro {
    String marca;
    String modelo;
    int ano;
    //Declarando um atributo estático
    //Existe independente da criação de instância
    //É único para todas as instâncias
    static int numeroRodas;

    void mostraDados(){
        IO.println("Marca: "+marca);
        IO.println("Modelo: "+modelo);
        IO.println("Ano: "+ano);
        IO.println("Número rodas: "+numeroRodas);
    }
}
