package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.H_heranca.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafaeel", 23);
        Endereco endereco = new Endereco("Antonio Goncalves de Farias", "88509-758");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
    }
}
