package academy.devdojo.maratonajava.javacore.K_enumeracao.dominio;

public class Cliente02 {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento(){
        return tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
