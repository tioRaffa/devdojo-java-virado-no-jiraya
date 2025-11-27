package academy.devdojo.maratonajava.javacore.K_enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA("CPF"),
    PESSOA_JURIDICA("CNPJ");

    private final String descricao;

    TipoCliente(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
