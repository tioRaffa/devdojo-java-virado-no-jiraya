package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class TimeTest01 {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid");

        Jogador jogador01 = new Jogador("Cristiano Ronaldo");
        jogador01.setTime(time);

        Jogador jogador02 = new Jogador("Marcelo");
        jogador02.setTime(time);

        Jogador jogador03 = new Jogador("Neymar Jr");
        jogador03.setTime(time);

        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};
        time.setJogadores(jogadores);
        time.imprime();

        System.out.println();
        System.out.println("Jogador");
        for (Jogador jogador : jogadores){
            jogador.imprir();
        }


    }
}
