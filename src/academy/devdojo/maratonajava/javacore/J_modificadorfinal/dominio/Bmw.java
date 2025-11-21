package academy.devdojo.maratonajava.javacore.J_modificadorfinal.dominio;

public class Bmw extends Carro{
    private double valor;

    public Bmw(String modelo, double valor) {
        super(modelo);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Valor: R$" + this.valor);
    }
}
