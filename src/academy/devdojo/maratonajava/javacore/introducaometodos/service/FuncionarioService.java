package academy.devdojo.maratonajava.javacore.introducaometodos.service;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioService {
    public void imprimeFuncionario(Funcionario funcionario){
        if (funcionario.name == null || funcionario.age <= 0 || funcionario.salary == null){
            return;
        }

        System.out.println("Nome: "+funcionario.name+", Idade: "+funcionario.age);

        for (int i = 0; i < funcionario.salary.length; i++) {
            int count = i + 1;
            System.out.println("Salario "+count+" R$"+funcionario.salary[i]);
        }
    }


    public void mediaSalarial(int... salarios){
        if (salarios == null){
            return;
        }

        int soma = 0;
        for (int salario : salarios){
            soma += salario;
        }
        int media = soma / salarios.length;
        System.out.println("Média Salarial = R$"+media);

    }
}
