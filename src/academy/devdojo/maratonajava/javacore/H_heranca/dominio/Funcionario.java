package academy.devdojo.maratonajava.javacore.H_heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }
    public Funcionario(String nome, int idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
