package academy.devdojo.maratonajava.javacore.introducaometodos.domaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.domaoclasses.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros();
        calculadora.tabuadaDoDois();

    }
}
