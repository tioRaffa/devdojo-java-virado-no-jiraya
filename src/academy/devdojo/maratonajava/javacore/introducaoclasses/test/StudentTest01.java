package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Rafael";
        student1.age = 23;
        student1.gender = 'M';

        System.out.println("Nome: "+student1.name+", Idade: "+student1.age+", Genero: "+student1.gender);
        System.out.println((student1));
    }
}
