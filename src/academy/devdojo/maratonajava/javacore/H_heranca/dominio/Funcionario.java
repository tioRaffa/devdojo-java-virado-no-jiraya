package academy.devdojo.maratonajava.javacore.H_heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    public Funcionario(String nome, int idade, double salario,Endereco endereco) {
        super(nome, idade, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salario: R$" + getSalario());
    }
}
