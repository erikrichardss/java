package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Lucy";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
