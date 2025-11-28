package academy.devdojo.maratonajava.javacore.K_enumeracao.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    CREDITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.10;
        }
    };

    public abstract double CalcularDesconto(double valor);
}
