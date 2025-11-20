package academy.devdojo.maratonajava.javacore.E_blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.E_blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ");

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio);
        }


    }
}
