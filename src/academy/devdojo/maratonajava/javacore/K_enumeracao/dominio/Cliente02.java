package academy.devdojo.maratonajava.javacore.K_enumeracao.dominio;

public class Cliente02 {
    public enum TipoPagamento {
        DEBITO, CREDITO, PIX
    }
    private String nome;
    private TipoPagamento tipoPagamento;

    public Cliente02(String nome, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
