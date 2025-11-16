package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Dragon Ball Z");
        anime.setEpisodios(400);
        anime.setTipo("TV");

        anime.imprime();
    }
}
