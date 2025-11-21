package academy.devdojo.maratonajava.javacore.H_heranca.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, Endereco endereco){
        this(nome, idade);
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void imprime(){
        System.out.println(
                "Nome: " + getNome()+
                ", Idade: " + getIdade()
        );
        if (this.endereco != null){
            endereco.imprime();
        }
    }
}

