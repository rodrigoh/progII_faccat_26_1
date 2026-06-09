package aula15.exemplosExcecao;

public class LeCoordenada {
    //Exemplo de método que pode ser usado para ler coordenadas
    public static int[] leCoordenadas(){
        boolean erro;
        int x=0;
        int y=0;
        do {
            try {
                String texto = IO.readln("Digite uma coordenada do mapa Ex A4: ").toUpperCase();
                x = (int)texto.charAt(0);
                x -= 65;
                y = Integer.parseInt(String.valueOf(texto.charAt(1)));
                if (x < 0 || x > 9) {
                    IO.println("Os valores aceitos são A a J e 0 a 9, por exemplo B2");
                    erro = true;
                }
                else
                    erro = false;
            } catch (NumberFormatException e) {
                IO.println("Digite uma letra seguida de um número");
                erro = true;
            }
        }
        while (erro);
        return new int[] {x,y};

    }
    static void main() {
        int[] coord = leCoordenadas();
        IO.println("X = "+coord[0]);
        IO.println("Y = "+coord[1]);


    }
}
