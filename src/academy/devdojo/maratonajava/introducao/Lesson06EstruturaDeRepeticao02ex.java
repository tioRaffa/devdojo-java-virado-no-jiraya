package academy.devdojo.maratonajava.introducao;

public class Lesson06EstruturaDeRepeticao02ex {
    public static void main(String[] args) {

        for (int i=0; i <= 100; i++){
            boolean isPar = (i % 2 == 0);

            if (isPar && i <=25){
                System.out.println("xx "+i+" xx");
            }

        }
    }
}
