package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carList = new ArrayList<>(
            List.of(new Car("green", 2011),
                    new Car("red", 1998),
                    new Car("blacj", 2019)));

    public static void main(String[] args) {

        System.out.println(filterGreenCar(carList));
        System.out.println(filterRedCar(carList));
        System.out.println(filterCarByColor(carList, "red"));
        System.out.println(filterByYearBefore(carList, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {

        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {

            if (car.getCor().equals("green")) {

                filterCar.add(car);
            }
        }

        return filterCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {

        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {

            if (car.getCor().equals("green")) {

                filterCar.add(car);
            }
        }

        return filterCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {

        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {

            if (car.getCor().equals(color)) {

                filterCar.add(car);
            }
        }

        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {

        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {

            if (car.getAno() < year) {

                filterCar.add(car);
            }
        }

        return filterCar;
    }
}
