package academy.devdojo.maratonajava.javacore.contrutores.test;

import academy.devdojo.maratonajava.javacore.contrutores.dominio.Anime;
import academy.devdojo.maratonajava.javacore.contrutores.service.AnimeService;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragno Ball Z", "Luta", 400);

        AnimeService service = new AnimeService();
        service.imprimeAnime(anime);
    }
}
