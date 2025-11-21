package academy.devdojo.maratonajava.javacore.Z_exercicios.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    // Construtor
    public Professor(String nome, String especialidade){
        this.especialidade = especialidade;
        this.nome = nome;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    // Get e Set - NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // Get e Set - ESPECIALIDADE
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    // Get e Set - SEMINARIO
    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }
    public Seminario[] getSeminarios(){
        return seminarios;
    }

    public void imprime(){
        System.out.println(
                "Nome Professor: " + getNome() +
                ", Especialidade: " + getEspecialidade()
        );
        if (this.seminarios != null){
            for (Seminario seminario : seminarios){
                seminario.imprime();
            }
        }
    }
}
