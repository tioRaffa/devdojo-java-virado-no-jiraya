package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private int[] salary;
    private int media;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int[] getSalary() {
        return salary;
    }
    public int getMedia() {
        return media;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int[] salary){
        this.salary = salary;
    }
}
