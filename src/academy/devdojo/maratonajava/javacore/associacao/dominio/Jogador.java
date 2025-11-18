package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public void setTime(Time time){
        this.time = time;
    }
    public Time getTime(){
        return time;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void imprir(){
        System.out.println(this.nome);
        System.out.println(this.time.getNome());
    }

}
