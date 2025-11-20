package academy.devdojo.maratonajava.javacore.F_modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Bloco Contrutor -- Quase NUNCA usado!!
    static {
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;

        for (int ep : Anime.episodios){
            System.out.print(ep+" ");
        }
    }

    public static int[] getEpisodios(){
        return Anime.episodios;
    }

}
