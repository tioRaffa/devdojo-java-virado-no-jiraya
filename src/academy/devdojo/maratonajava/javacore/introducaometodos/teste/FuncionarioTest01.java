package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.introducaometodos.service.FuncionarioService;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setName("Rafael");
        funcionario01.setAge(23);

        int[] salary = {2300, 1400, 3000};
        funcionario01.setSalary(salary);

        FuncionarioService service = new FuncionarioService();

        service.imprimeFuncionario(funcionario01);
        service.mediaSalarial(salary);

    }
}
