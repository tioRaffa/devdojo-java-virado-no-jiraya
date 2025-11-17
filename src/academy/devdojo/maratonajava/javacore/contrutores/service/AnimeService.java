package academy.devdojo.maratonajava.javacore.contrutores.service;

import academy.devdojo.maratonajava.javacore.contrutores.dominio.Anime;

public class AnimeService {
    public void imprimeAnime(Anime anime){
        System.out.println(
                "Nome: "+ anime.getNome()+
                ", Tipo: " + anime.getTipo() +
                ", episodios: "+ anime.getEpisodios()
        );
    }
}
