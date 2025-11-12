package academy.devdojo.maratonajava.introducao;

public class Lesson06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        double valorTotal = 3000;
        for (int parcela = (int) valorTotal; parcela >= 1; valorTotal--){
            double valorParcela = valorTotal / parcela;
            System.out.println(valorParcela);
        }
    }
}
