package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private int velocidadeMax;
    private int velocidadeLimite = 250;

    public Carro(String nome, int velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }
    public void imprime(){
        System.out.println(
                "Nome: " + this.nome +
                ", Velocidade Maxima: " + this.velocidadeMax +
                ", Velocidade Limite: " + this.velocidadeLimite
        );
    }

    // GET
    public String getNome(){
        return nome;
    }
    public int getVelocidadeMax(){
        return velocidadeMax;
    }
    public int getVelocidadeLimite(){
        return velocidadeLimite;
    }
    // SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVelocidadeMax(int velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
    public void setVelocidadeLimite(int velocidadeLimite){
        this.velocidadeLimite = velocidadeLimite;
    }
}
