package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Samrphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {

    public static void main(String[] args) {

        Samrphone s1 = new Samrphone("1ABABA", "Sansung");
        Samrphone s2 = new Samrphone("121212", "Iphone");
        Samrphone s3 = new Samrphone("131313", "Nokia");


        List<Samrphone> samrphones = new ArrayList<>(6);

        samrphones.add(s1);
        samrphones.add(s2);
        samrphones.add(0, s3);

        for (Samrphone samrphone : samrphones) {

            System.out.println(samrphone.toString());
        }

        Samrphone s4 = new Samrphone("121212", "Iphone");

        System.out.println(samrphones.contains(s4));
        int indexSmartphone = samrphones.indexOf(s4);
        System.out.println(indexSmartphone);
    }
}
