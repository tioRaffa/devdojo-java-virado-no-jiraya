package academy.devdojo.maratonajava.javacore.introducaometodos.service;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioService {
    public void imprimeFuncionario(Funcionario funcionario){
        if (funcionario.getName() == null || funcionario.getAge() <= 0 || funcionario.getSalary() == null){
            return;
        }

        System.out.println("Nome: "+funcionario.getName()+", Idade: "+funcionario.getAge());

        int[] salary = funcionario.getSalary();
        for (int i = 0; i < 3; i++) {
            int count = i + 1;
            System.out.println("Salario "+count+" R$"+salary[i]);
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
