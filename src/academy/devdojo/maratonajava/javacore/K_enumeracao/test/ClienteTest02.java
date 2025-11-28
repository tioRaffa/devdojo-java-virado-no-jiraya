package academy.devdojo.maratonajava.javacore.K_enumeracao.test;

import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.Cliente02;
import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.TipoPagamento;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente02 cliente02 = new Cliente02("Rafael", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        double preco = cliente02.getTipoPagamento().CalcularDesconto(100);
        System.out.println(preco);
        System.out.println(cliente02);
    }
}
