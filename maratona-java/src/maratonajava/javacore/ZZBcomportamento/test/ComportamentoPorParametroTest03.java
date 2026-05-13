package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> carList = new ArrayList<>(
            List.of(new Car("green", 2011),
                    new Car("red", 1998),
                    new Car("blacj", 2019)));

    public static void main(String[] args) {

        List<Car> green = filter(carList, car -> car.getCor().equals("green"));
        List<Car> red = filter(carList, car -> car.getCor().equals("red"));
        List<Car> yearBefore = filter(carList, car -> car.getAno() < 2015);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(filter(nums, num -> num %2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

        List<T> filteredList = new ArrayList<>();

        for (T e : list) {

            if (predicate.test(e)) {

                filteredList.add(e);
            }
        }

        return filteredList;
    }
}
