package academy.devdojo.maratonajava.javacore.H_heranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua) {
        this.rua = rua;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return cep;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
}
