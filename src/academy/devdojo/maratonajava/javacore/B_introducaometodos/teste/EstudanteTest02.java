package academy.devdojo.maratonajava.javacore.B_introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.B_introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Rafael";
        estudante.age = 23;
        estudante.gender = 'M';

        estudante.imprime();

    }

}
