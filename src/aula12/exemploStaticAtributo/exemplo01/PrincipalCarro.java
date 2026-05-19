package aula12.exemploStaticAtributo.exemplo01;

public class PrincipalCarro {
    static void main() {
        Carro c1 = new Carro();
        c1.marca = "vw";
        c1.modelo = "Fusca";
        c1.ano = 1980;
        c1.numeroRodas = 5;
        c1.mostraDados();

        Carro c2 = new Carro();
        c2.marca = "BYD";
        c2.modelo = "Dolphin";
        c2.ano = 2025;
        c2.numeroRodas = 4;
        c2.mostraDados();

        c1.mostraDados();

        Carro.numeroRodas = 3;

        c2.mostraDados();

        c1.mostraDados();
    }
}
