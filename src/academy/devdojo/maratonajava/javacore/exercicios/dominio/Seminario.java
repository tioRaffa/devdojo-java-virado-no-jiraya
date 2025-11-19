package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Seminario {
    private String nome;
    private Estudante[] estudantes;
    private Local local;

    // Construtor
    public Seminario(String nome){
        this.nome = nome;
    }
    public Seminario(String nome, Estudante[] estudantes){
        this.nome = nome;
        this.estudantes = estudantes;
    }

    // Get e Set - NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // Get e Set - Estudantes
    public void setEstudantes(Estudante[] estudantes){
        this.estudantes = estudantes;
    }
    public Estudante[] getEstudantes(){
        return estudantes;
    }

    // Get e Set - Local
    public void setLocal(Local local){
        this.local = local;
    }
    public Local getLocal(){
        return local;
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());

        if (this.estudantes != null){
            for (Estudante estudante : this.estudantes){
                System.out.println(
                        "Nome Estudante: " + estudante.getNome()
                );
            }
        }

        if (this.local != null){
            Local localSeminario = getLocal();
            localSeminario.imprime();
        }

    }

}
