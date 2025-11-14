package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.CarClass;

public class CarTest01 {
    public static void main(String[] args) {
        CarClass car01 = new CarClass();

        car01.model = "Volskwagem";
        car01.name = "Gol 1.6";
        car01.year = 2013;
        car01.price = 41000;

        System.out.println(car01.name+", "+car01.model+", "+car01.year+", R$"+car01.price);
    }

}
