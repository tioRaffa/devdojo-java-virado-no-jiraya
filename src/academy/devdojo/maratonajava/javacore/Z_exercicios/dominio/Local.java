package academy.devdojo.maratonajava.javacore.Z_exercicios.dominio;

public class Local {
    private String endereco;
    public String cep;
    public static String cidade;

    public Local(String endereco, String cep){
        this.endereco = endereco;
        this.cep = cep;
    }

    static {
        Local.cidade = "Lages - SC";
    }
    public static String getCidade(){
        return cidade;
    }
    public static void setCidade(String cidade){
        Local.cidade = cidade;
    }

    // Setter
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCep(String cep){
        this.cep = cep;
    }

    // Getter
    public String getEndereco(){
        return endereco;
    }
    public String getCep(){
        return cep;
    }

    public void imprime(){
        System.out.println(
                "Endereço: " + getEndereco() +
                ", Cep: " + getCep() +
                ", Cidade: " + getCidade()
        );
    }
}
