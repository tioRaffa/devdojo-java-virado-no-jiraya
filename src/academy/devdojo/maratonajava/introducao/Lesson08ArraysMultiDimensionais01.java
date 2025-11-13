package academy.devdojo.maratonajava.introducao;

public class Lesson08ArraysMultiDimensionais01 {
    public static void main(String[] args) {
        int [][] days = new int[3][3];

        days[0][0] = 31;
        days[0][1] = 38;
        days[0][2] = 31;

        for (int i = 0; i < days.length ; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println("Array - "+days[i]+" "+days[i][j]);
            }
            
        }

    }
}
