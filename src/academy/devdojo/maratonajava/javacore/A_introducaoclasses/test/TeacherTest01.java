package academy.devdojo.maratonajava.javacore.A_introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.A_introducaoclasses.dominio.TeacherClass;

public class TeacherTest01 {
    public static void main(String[] args) {
        TeacherClass teacher01 = new TeacherClass();

        teacher01.name = "Rafael";
        teacher01.age = 23;
        teacher01.gender = 'M';
        teacher01.school = "Unifacvest";

        System.out.println(teacher01.name+", "+teacher01.age+", "+teacher01.gender+", "+teacher01.school);

    }

}
