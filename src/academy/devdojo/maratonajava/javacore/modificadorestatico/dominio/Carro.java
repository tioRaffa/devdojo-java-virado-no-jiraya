package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private int velocidadeMax;

    // atributo da classe
    private static int velocidadeLimite = 250;

    // Construtor
    public Carro(String nome, int velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public static void setVelocidadeLimite(int velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static int getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    // Metodo do objeto
    public void imprime(){
        System.out.println(
                "Nome: " + this.nome +
                ", Velocidade Maxima: " + this.velocidadeMax +
                ", Velocidade Limite: " + Carro.velocidadeLimite
        );
    }

}
