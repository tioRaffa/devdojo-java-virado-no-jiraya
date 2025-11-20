package academy.devdojo.maratonajava.javacore.C_sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String temporada;

    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEpisodios(){
        return episodios;
    }
    public String getGenero() {
        return genero;
    }
    private String getTemporada(){
        return temporada;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public void init(String nome, String tipo, int episodios, String genero, String temporada){
        this.init(nome, tipo, episodios,genero);
        this.temporada = temporada;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

}
