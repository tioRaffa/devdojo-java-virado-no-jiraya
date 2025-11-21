package academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio;

public class Carro {
    private String modelo;
    private static final int VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String modelo){
        this.modelo = modelo;
    }
    public Comprador getComprador(){
        return this.COMPRADOR;
    }

    public void imprime(){
        System.out.println(
                "Model: " + this.modelo +
                ", Velocidade Limite: " + Carro.VELOCIDADE_LIMITE+
                " // Comprador: " + this.COMPRADOR.getNome()
        );
    }

}
