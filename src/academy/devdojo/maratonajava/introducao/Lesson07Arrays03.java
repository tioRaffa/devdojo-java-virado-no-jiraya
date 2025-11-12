package academy.devdojo.maratonajava.introducao;

public class Lesson07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
        //}

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
