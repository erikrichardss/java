package exercise.pacote03.ex02;

import exercise.pacote03.ex02.domain.Order;
import exercise.pacote03.ex02.domain.Status;
import exercise.pacote03.ex02.service.StockService;
import exercise.pacote03.ex02.thread.OrderProcessor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest01 {
    public static void main(String[] args) throws InterruptedException {
        Order o1 = new Order("Erik", 2.99, Status.CREATED);
        Order o2 = new Order("Ana", 2.99, Status.SHIPPING);
        Order o3 = new Order("Luzia", 4.99, Status.PAYING);
        Order o4 = new Order("Maria", 1.99, Status.CREATED);
        Order o5 = new Order("Júlia", 1.99, Status.PREPARING);
        Order o6 = new Order("Bianca", 3.99, Status.CREATED);

        StockService stockService = new StockService();

//        Thread t1 = new Thread(new OrderProcessor(o1));
//        Thread t2 = new Thread(new OrderProcessor(o2));
//        Thread t3 = new Thread(new OrderProcessor(o3));
//        Thread t4 = new Thread(new OrderProcessor(o4));
//        Thread t5 = new Thread(new OrderProcessor(o5));
//        Thread t6 = new Thread(new OrderProcessor(o6));

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new OrderProcessor(o1, stockService));
        executor.submit(new OrderProcessor(o2, stockService));
        executor.submit(new OrderProcessor(o3, stockService));
        executor.shutdown();

//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
        System.out.println("All the order processor");
//        t4.start();
//        t5.start();
//        t6.start();
    }
}
