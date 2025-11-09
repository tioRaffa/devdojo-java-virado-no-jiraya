package academy.devdojo.maratonajava.introducao;

public class Lesson05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isCategoriaInfatil = idade <= 14;
        boolean isCategoriaJuvenil = idade >= 15 && idade <=17;
        String categoria;

        if (isCategoriaInfatil){
            categoria = "Categoria Infantil";
        } else if (isCategoriaJuvenil) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
