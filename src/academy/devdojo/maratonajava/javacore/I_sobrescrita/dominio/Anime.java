package academy.devdojo.maratonajava.javacore.I_sobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString(){
        return this.nome;
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }





}
