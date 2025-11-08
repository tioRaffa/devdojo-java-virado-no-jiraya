package academy.devdojo.maratonajava.introducao;

public class Lesson05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (isAutorizadoComprarBebida){
            System.out.println("Tá Liberado Chefe");
        } else if (!isAutorizadoComprarBebida) {
            System.out.println("Tá Liberado Não kakak");
        }
    }
}