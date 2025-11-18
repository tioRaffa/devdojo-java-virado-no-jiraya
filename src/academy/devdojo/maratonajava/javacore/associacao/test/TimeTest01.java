package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class TimeTest01 {
    public static void main(String[] args) {
        Time time = new Time("Real Madrid");
        Jogador jogador01 = new Jogador("Cristiano Ronaldo");
        Jogador jogador02 = new Jogador("Marcelo");
        Jogador jogador03 = new Jogador("Neymar Jr");

        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};
        time.setJogadores(jogadores);
        time.imprime();


    }
}
