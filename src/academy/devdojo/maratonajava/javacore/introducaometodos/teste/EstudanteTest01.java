package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.name = "Rafael";
        estudante01.age = 23;
        estudante01.gender = 'M';

        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();
        imprimeEstudante.estudante(estudante01);



    }

}
