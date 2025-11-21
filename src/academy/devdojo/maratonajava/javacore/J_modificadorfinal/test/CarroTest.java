package academy.devdojo.maratonajava.javacore.J_modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro("Gol G6");
        c.COMPRADOR.setNome("Rafael");
        c.imprime();
    }
}
