package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;
import maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> carList = new ArrayList<>(
            List.of(new Car("green", 2011),
                    new Car("red", 1998),
                    new Car("blacj", 2019)));

    public static void main(String[] args) {

//        List<Car> green = filter(carList, new CarPredicate() {
//
//            @Override
//            public boolean test(Car car) {
//
//                return car.getCor().equals("green");
//            }
//        });

        List<Car> green = filter(carList, car -> car.getCor().equals("green"));
        List<Car> red = filter(carList, car -> car.getCor().equals("red"));
        List<Car> yearBefore = filter(carList, car -> car.getAno() < 2015);

        System.out.println(green);
        System.out.println(red);
        System.out.println(yearBefore);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {

        List<Car> filterCar = new ArrayList<>();

        for (Car car : cars) {

            if (carPredicate.test(car)) {

                filterCar.add(car);
            }
        }

        return filterCar;
    }
}
