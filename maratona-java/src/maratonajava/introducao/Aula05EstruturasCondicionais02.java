package maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 17;
        String categoria;
        String categoriaDois;

        if(idade < 15) {
            categoria = ("Categoria Infantil");
        } else if(idade >=15 && idade < 18) {
            categoria = ("Categoria Juvenil");
        } else {
            categoria = ("Categoria Adulta");
        }

        categoriaDois = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria adulto";

        System.out.println(categoria);
        System.out.println(categoriaDois);
    }
}
