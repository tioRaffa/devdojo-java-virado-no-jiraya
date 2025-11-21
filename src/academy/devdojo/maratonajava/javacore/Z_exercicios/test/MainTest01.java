package academy.devdojo.maratonajava.javacore.Z_exercicios.test;

import academy.devdojo.maratonajava.javacore.Z_exercicios.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Z_exercicios.dominio.Local;
import academy.devdojo.maratonajava.javacore.Z_exercicios.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Z_exercicios.dominio.Seminario;

public class MainTest01 {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Unifacvest");

        Local local = new Local("Rua Antonio goncalves", "88500-045");
        seminario.setLocal(local);

        Estudante estudante01 = new Estudante("Rafael", 23, seminario);
        Estudante estudante02 = new Estudante("Julio", 22, seminario);
        Estudante[] estudantes = new Estudante[]{estudante01, estudante02};
        seminario.setEstudantes(estudantes);

        Seminario[] seminarios = new Seminario[]{seminario};
        Professor professor = new Professor("Rafal", "Backend", seminarios);

        professor.imprime();
        System.out.println("----------");
        seminario.imprime();

    }
}
