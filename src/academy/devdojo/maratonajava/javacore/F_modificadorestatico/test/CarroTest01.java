package academy.devdojo.maratonajava.javacore.F_modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.F_modificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol G6", 350);

        Carro.setVelocidadeLimite(150);
        carro.imprime();
        int veloLimite = Carro.getVelocidadeLimite();
        System.out.println(veloLimite);

    }
}
