package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.H_heranca.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Rafael", 23);
        Endereco e = new Endereco("Sete de Setembro", "88403-240");
        f.setEndereco(e);
        f.setSalario(2500);
        f.imprime();
    }
}
