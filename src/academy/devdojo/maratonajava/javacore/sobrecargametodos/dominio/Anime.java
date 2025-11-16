package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEpisodios(){
        return episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

}
