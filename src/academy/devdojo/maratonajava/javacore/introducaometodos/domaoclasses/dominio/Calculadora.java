package academy.devdojo.maratonajava.javacore.introducaometodos.domaoclasses.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void multiplicaDoisNumeros(){
        System.out.println(2*9);
    }
    public void tabuadaDoDois(){
        for (int i = 1; i < 21; i++) {
            int total = 2*i;
            System.out.println("2 x "+i+" = "+total);
        }
    }
}
