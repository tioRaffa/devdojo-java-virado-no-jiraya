package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;
    public Escola(String nome){
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores){
        this.professores = professores;
    }
    public Professor[] getProfessores(){
        return professores;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }


    public void imprime(){
        System.out.println(this.nome);
        if (this.professores != null){
            int i = 0;
            for (Professor professor : professores){
                i++;
                System.out.println("Professor "+i+": "+professor.getNome());
            }
        }
    }
}
