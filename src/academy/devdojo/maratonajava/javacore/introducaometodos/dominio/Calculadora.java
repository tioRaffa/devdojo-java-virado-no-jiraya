package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

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
    public void subtraiDoisNumeros(int num1, int num2){
        int subtracao = num1 - num2;
        System.out.println(subtracao);
    }
    public void tabuada(int num1){
        for (int i = 1; i <= 10; i++) {
            int total = num1 * i;
            System.out.println(num1+" x "+i+" = "+total);

        }
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void replaceNum(int num1, int num2){
        int number1 = num1;
        int number2 = num2;

        System.out.println(number1+" "+number2);
    }

    // AULA 52
    public void somaArray(int[] numbers){
        int total = 0;
        for (int num : numbers){
            System.out.println(num+" + "+total+" = "+(total+num));
            total += num;
        }

    }
    public void somaVarArgs(int... numbers){
        int total = 0;
        for (int num : numbers){
            System.out.println(num+" + "+total+" = "+(total+num));
            total += num;
        }
    }
    // ---------------------------------------- 52

}