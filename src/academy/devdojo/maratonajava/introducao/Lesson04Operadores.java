package academy.devdojo.maratonajava.introducao;

public class Lesson04Operadores {
    public static void main(String[] args) {
        // +, -, /, *
        int numero01 = 10;
        int numero02 = 20;
        int subtracao = numero02-numero01;
        System.out.println(numero02+" - "+numero01+" = "+subtracao);

        int soma = numero01+numero02;
        System.out.println(numero01+" + "+numero02+" = "+soma);

        // Divisão
        double num03 = 10;
        double num04 = 20;
        double divisao = num03 / num04;
        System.out.println(num03+" / "+num04+" = "+divisao);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // menor <,
        // maior >,
        // menor ou igual <=,
        // maior ou igual >=,
        // igual ==,
        // diferente !=

        // && (and) - || (or)
        int idade = 35;
        double salario = 4600;
        boolean isIdadeAndSalarioDentroDaLei = idade >= 30 && salario >= 4612;
        System.out.println(isIdadeAndSalarioDentroDaLei);

        // ! (not)

    }
}
