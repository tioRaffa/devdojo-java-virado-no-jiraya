package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.G_associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Escola escola = new Escola("Vidal Ramos");
        Professor professor01 = new Professor("Pintudo");
        Professor professor02 = new Professor("Xerecudo");
        Professor[] professors = new Professor[]{professor01, professor02};

        escola.setProfessores(professors);
        escola.imprime();

    }
}
