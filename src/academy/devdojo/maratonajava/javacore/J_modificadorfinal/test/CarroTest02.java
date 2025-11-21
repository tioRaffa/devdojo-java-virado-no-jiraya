package academy.devdojo.maratonajava.javacore.J_modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio.Bmw;

public class CarroTest02 {
    public static void main(String[] args) {
        Bmw m3 = new Bmw("M3", 450000);
        m3.COMPRADOR.setNome("Rafael Muniz");

        m3.imprime();
    }
}
