package academy.devdojo.maratonajava.introducao;

public class Lesson04Operadores {
    public static void main(String[] args) {
        // +, -, /, *
        int numero01 = 10;
        int numero02 = 20;
        int subtracao = numero02-numero01;
        int soma = numero01+numero02;

        double num03 = 10;
        double num04 = 20;
        double divisao = num03 / num04;

        System.out.println(numero02+" - "+numero01+" = "+subtracao);
        System.out.println(numero01+" + "+numero02+" = "+soma);
        System.out.println(num03+" / "+num04+" = "+divisao);
    }
}
