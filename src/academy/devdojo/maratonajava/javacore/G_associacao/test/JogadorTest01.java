package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("CR7");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Neymar JR");

        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores){
            jogador.imprir();
        }
    }


}
