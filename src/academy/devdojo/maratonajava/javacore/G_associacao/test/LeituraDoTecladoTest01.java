package academy.devdojo.maratonajava.javacore.G_associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Digite Sua idade:");
        int idade = input.nextInt();

        System.out.println("Digite seu genero M/F");
        char genero = input.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(genero);
    }
}
