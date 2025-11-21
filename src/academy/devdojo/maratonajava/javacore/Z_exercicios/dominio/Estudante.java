package academy.devdojo.maratonajava.javacore.Z_exercicios.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    // Construtor
    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Estudante(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

     // Get e Set - NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // Get e Set - Idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    // Get e Set - SEMINARIO
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    public Seminario getSeminario(){
        return seminario;
    }

    public void imprime(){
        System.out.println(
                "Nome Estudande: " + getNome() +
                "Idade: " + getIdade()
        );
        if (this.seminario != null){
            System.out.println(
                    "Seminario: " + getSeminario().getNome()
            );
        }
    }

}
