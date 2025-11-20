package academy.devdojo.maratonajava.javacore.C_sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.C_sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball", "Tv", 400, "Luta");

        anime.imprime();
    }
}
