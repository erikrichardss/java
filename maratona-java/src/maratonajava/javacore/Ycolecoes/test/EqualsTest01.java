package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Samrphone;

public class EqualsTest01 {

    public static void main(String[] args) {

        Samrphone s1 = new Samrphone("1ABC1", "Iphone");
        Samrphone s2 = new Samrphone("1ABC1", "Iphone");

        System.out.println(s1.equals(s2));
    }
}
