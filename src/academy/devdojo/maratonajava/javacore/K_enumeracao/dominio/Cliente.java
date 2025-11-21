package academy.devdojo.maratonajava.javacore.K_enumeracao.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;


    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void imprime(){
        System.out.println(
                "Nome: " + getNome()+
                ", Tipo Cliente: " + getTipoCliente()
        );
    }
}
