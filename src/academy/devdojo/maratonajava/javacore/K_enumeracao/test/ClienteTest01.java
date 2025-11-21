package academy.devdojo.maratonajava.javacore.K_enumeracao.test;

import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.K_enumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafael", TipoCliente.PESSOA_JURIDICA);
        cliente.imprime();
    }
}
