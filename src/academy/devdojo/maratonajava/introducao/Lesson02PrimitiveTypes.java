package academy.devdojo.maratonajava.introducao;

public class Lesson02PrimitiveTypes {
    public static void  main(String[] args){
        // int, float, char, boolean, double, byte, short, long
        int idade = 23;
        byte idadeByte = 10;
        short idadeShort = 5;
        boolean idadeMaiorBoolean = true;
        boolean idadeMenorBoolean = false;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;
        long salarioLong = 50000;
        String nome = "Rafael";

        System.out.println("A idade é "+idade   +" anos");
        System.out.println("O funcionario "+nome+" Tem "+idade+" anos e recebe por mes R$"+salarioLong);
    }

}
