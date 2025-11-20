package academy.devdojo.maratonajava.javacore.E_blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // Bloco Contrutor -- Quase NUNCA usado!!
    {
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }

}
