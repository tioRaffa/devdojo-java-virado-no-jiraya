package academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio;

public class Carro {
    private String modelo;
    private static final int VELOCIDADE_LIMITE = 250;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void imprime(){
        System.out.println(
                "Model: " + this.modelo +
                ", Velocidade Limite: " + Carro.VELOCIDADE_LIMITE
        );
    }

}
