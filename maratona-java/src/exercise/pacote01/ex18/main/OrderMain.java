package exercise.pacote01.ex18.main;

import exercise.pacote01.ex18.classe.OrderClass;

public class OrderMain {
    public static void main(String[] args) {
        OrderClass orderOne = new OrderClass("12321", "João", 23);
        OrderClass orderTwo = new OrderClass("12321", "Maria", 12, "Confirmed");
        OrderClass orderThree = new OrderClass.Builder()
                .orderId("12321")
                .customerName("Nicole")
                .amount(13)
                .status("")
                .build();

        System.out.println(OrderClass.getTotalOrders());
    }
}