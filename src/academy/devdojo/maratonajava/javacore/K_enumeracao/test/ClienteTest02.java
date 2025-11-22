package academy.devdojo.maratonajava.javacore.K_enumeracao.test;

import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.Cliente02;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente02 cliente02 = new Cliente02("Rafael", Cliente02.TipoPagamento.PIX);
        System.out.println(cliente02);
    }
}
