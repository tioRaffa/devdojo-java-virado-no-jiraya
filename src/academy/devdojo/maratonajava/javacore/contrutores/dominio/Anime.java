package academy.devdojo.maratonajava.javacore.contrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    // Construtor
    public Anime(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // GET
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEpisodios(){
        return episodios;
    }
}
