package academy.devdojo.maratonajava.javacore.B_introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rafael");
        pessoa.setIdade(32);
        pessoa.imprime();
        String nome = pessoa.getNome();
        int idade = pessoa.getIdade();
        System.out.println(nome+" "+idade);
    }
}
