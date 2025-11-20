package academy.devdojo.maratonajava.javacore.D_contrutores.service;

import academy.devdojo.maratonajava.javacore.D_contrutores.dominio.Anime;

public class AnimeService {
    public void imprimeAnime(Anime anime){
        System.out.println(
                "Nome: " + anime.getNome()+
                ", Tipo: " + anime.getTipo() +
                ", Episodios: " + anime.getEpisodios() +
                ", Categoria: " + anime.getGenero()
        );
    }
}
